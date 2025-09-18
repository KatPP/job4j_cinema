package ru.job4j.cinema.service;

import ru.job4j.cinema.model.FilmSession;

import java.util.Collection;

/**
 * Интерфейс сервиса для работы с сеансами фильмов
 * Предоставляет бизнес-логику для работы с сеансами
 *
 * @author Константин
 * @version 1.0
 */
public interface FilmSessionService {

    /**
     * Получает все сеансы
     *
     * @return коллекция всех сеансов
     */
    Collection<FilmSession> findAll();

    /**
     * Находит сеанс по идентификатору
     *
     * @param id идентификатор сеанса
     * @return сеанс, если найден, иначе null
     */
    FilmSession findById(int id);
}