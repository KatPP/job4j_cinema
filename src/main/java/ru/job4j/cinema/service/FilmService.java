package ru.job4j.cinema.service;

import ru.job4j.cinema.dto.FilmDto;

import java.util.Collection;

/**
 * Интерфейс сервиса для работы с фильмами
 * Предоставляет бизнес-логику для работы с фильмами
 *
 * @author Константин
 * @version 1.0
 */
public interface FilmService {

    /**
     * Получает все фильмы с дополнительной информацией
     *
     * @return коллекция DTO фильмов
     */
    Collection<FilmDto> findAll();
}