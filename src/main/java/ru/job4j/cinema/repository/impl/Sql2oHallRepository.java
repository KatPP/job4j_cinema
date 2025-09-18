package ru.job4j.cinema.repository.impl;

import org.sql2o.Sql2o;
import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Hall;
import ru.job4j.cinema.repository.HallRepository;

import java.util.Optional;

/**
 * Реализация репозитория кинозалов с использованием Sql2o
 * Обеспечивает доступ к данным кинозалов через SQL-запросы
 *
 * @author Константин
 * @version 1.0
 */
@Repository
public class Sql2oHallRepository implements HallRepository {

    private final Sql2o sql2o;

    public Sql2oHallRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Optional<Hall> findById(int id) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM halls WHERE id = :id");
            var hall = query.addParameter("id", id)
                    .executeAndFetchFirst(Hall.class);
            return Optional.ofNullable(hall);
        }
    }
}