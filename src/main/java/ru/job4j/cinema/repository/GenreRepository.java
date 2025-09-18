package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Genre;

import java.util.Optional;

/**
 * Интерфейс репозитория для работы с жанрами
 * Предоставляет методы для доступа к данным жанров в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface GenreRepository {

    /**
     * Находит жанр по идентификатору
     *
     * @param id идентификатор жанра
     * @return Optional с жанром, если найден, иначе пустой Optional
     */
    Optional<Genre> findById(int id);
}