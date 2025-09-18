package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Film;
import java.util.Collection;
import java.util.Optional;

/**
 * Интерфейс репозитория для работы с фильмами
 * Предоставляет методы для доступа к данным фильмов в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface FilmRepository {

    /**
     * Находит фильм по идентификатору
     *
     * @param id идентификатор фильма
     * @return Optional с фильмом, если найден, иначе пустой Optional
     */
    Optional<Film> findById(int id);

    /**
     * Получает все фильмы
     *
     * @return коллекция всех фильмов
     */
    Collection<Film> findAll();
}