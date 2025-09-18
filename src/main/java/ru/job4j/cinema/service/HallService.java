package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Hall;

/**
 * Интерфейс сервиса для работы с кинозалами
 * Предоставляет бизнес-логику для работы с кинозалами
 *
 * @author Константин
 * @version 1.0
 */
public interface HallService {

    /**
     * Находит кинозал по идентификатору
     *
     * @param id идентификатор кинозала
     * @return кинозал, если найден, иначе null
     */
    Hall findById(int id);
}