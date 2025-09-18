package ru.job4j.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Hall;
import ru.job4j.cinema.repository.HallRepository;
import ru.job4j.cinema.service.HallService;

/**
 * Реализация сервиса кинозалов
 * Обеспечивает бизнес-логику для работы с кинозалами
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleHallService implements HallService {

    /**
     * Репозиторий кинозалов
     */
    private final HallRepository hallRepository;

    /**
     * Конструктор
     *
     * @param hallRepository репозиторий кинозалов
     */
    public SimpleHallService(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    @Override
    public Hall findById(int id) {
        return hallRepository.findById(id).orElse(null);
    }
}