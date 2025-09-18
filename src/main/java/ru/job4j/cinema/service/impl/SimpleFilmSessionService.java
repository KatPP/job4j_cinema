package ru.job4j.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.repository.FilmSessionRepository;
import ru.job4j.cinema.service.FilmSessionService;

import java.util.Collection;

/**
 * Реализация сервиса сеансов фильмов
 * Обеспечивает бизнес-логику для работы с сеансами
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleFilmSessionService implements FilmSessionService {

    /**
     * Репозиторий сеансов
     */
    private final FilmSessionRepository filmSessionRepository;

    /**
     * Конструктор
     *
     * @param filmSessionRepository репозиторий сеансов
     */
    public SimpleFilmSessionService(FilmSessionRepository filmSessionRepository) {
        this.filmSessionRepository = filmSessionRepository;
    }

    @Override
    public Collection<FilmSession> findAll() {
        return filmSessionRepository.findAll();
    }

    @Override
    public FilmSession findById(int id) {
        return filmSessionRepository.findById(id).orElse(null);
    }
}