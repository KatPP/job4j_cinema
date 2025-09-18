package ru.job4j.cinema.repository.impl;

import org.sql2o.Sql2o;
import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Genre;
import ru.job4j.cinema.repository.GenreRepository;

import java.util.Optional;

/**
 * Реализация репозитория жанров с использованием Sql2o
 * Обеспечивает доступ к данным жанров через SQL-запросы
 *
 * @author Константин
 * @version 1.0
 */
@Repository
public class Sql2oGenreRepository implements GenreRepository {

    private final Sql2o sql2o;

    public Sql2oGenreRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Optional<Genre> findById(int id) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM genres WHERE id = :id");
            var genre = query.addParameter("id", id)
                    .executeAndFetchFirst(Genre.class);
            return Optional.ofNullable(genre);
        }
    }
}