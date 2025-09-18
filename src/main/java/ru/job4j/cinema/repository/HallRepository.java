package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Hall;

import java.util.Optional;

/**
 * Интерфейс репозитория для работы с кинозалами
 * Предоставляет методы для доступа к данным кинозалов в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface HallRepository {

    /**
     * Находит кинозал по идентификатору
     *
     * @param id идентификатор кинозала
     * @return Optional с кинозалом, если найден, иначе пустой Optional
     */
    Optional<Hall> findById(int id);
}