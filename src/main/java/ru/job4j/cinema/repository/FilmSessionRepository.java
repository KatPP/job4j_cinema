package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.FilmSession;
import java.util.Collection;
import java.util.Optional;

/**
 * Интерфейс репозитория для работы с сеансами фильмов
 * Предоставляет методы для доступа к данным сеансов в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface FilmSessionRepository {

    /**
     * Находит сеанс по идентификатору
     *
     * @param id идентификатор сеанса
     * @return Optional с сеансом, если найден, иначе пустой Optional
     */
    Optional<FilmSession> findById(int id);

    /**
     * Получает все сеансы
     *
     * @return коллекция всех сеансов
     */
    Collection<FilmSession> findAll();
}