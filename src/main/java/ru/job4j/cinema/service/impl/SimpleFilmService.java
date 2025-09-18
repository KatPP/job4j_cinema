package ru.job4j.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.dto.FilmDto;
import ru.job4j.cinema.model.Film;
import ru.job4j.cinema.model.Genre;
import ru.job4j.cinema.repository.FilmRepository;
import ru.job4j.cinema.repository.GenreRepository;
import ru.job4j.cinema.service.FileService;
import ru.job4j.cinema.service.FilmService;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Реализация сервиса фильмов
 * Обеспечивает бизнес-логику для работы с фильмами
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleFilmService implements FilmService {

    /**
     * Репозиторий фильмов
     */
    private final FilmRepository filmRepository;

    /**
     * Репозиторий жанров
     */
    private final GenreRepository genreRepository;

    /**
     * Сервис файлов
     */
    private final FileService fileService;

    /**
     * Конструктор
     *
     * @param filmRepository  репозиторий фильмов
     * @param genreRepository репозиторий жанров
     * @param fileService     сервис файлов
     */
    public SimpleFilmService(FilmRepository filmRepository,
                             GenreRepository genreRepository,
                             FileService fileService) {
        this.filmRepository = filmRepository;
        this.genreRepository = genreRepository;
        this.fileService = fileService;
    }

    @Override
    public Collection<FilmDto> findAll() {
        Collection<Film> films = filmRepository.findAll();
        return films.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    /**
     * Преобразует модель фильма в DTO
     *
     * @param film модель фильма
     * @return DTO фильма
     */
    private FilmDto convertToDto(Film film) {
        String genreName = genreRepository.findById(film.getGenreId())
                .map(Genre::getName)
                .orElse("Неизвестный жанр");

        String posterPath = fileService.findById(film.getFileId())
                .map(file -> file.getPath())
                .orElse("/images/no-poster.jpg");

        return new FilmDto(
                film.getId(),
                film.getName(),
                film.getDescription(),
                film.getYear(),
                film.getMinimalAge(),
                film.getDurationInMinutes(),
                genreName,
                posterPath
        );
    }
}