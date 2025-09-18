package ru.job4j.cinema.repository.impl;

import org.sql2o.Sql2o;
import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.repository.FilmSessionRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * Реализация репозитория сеансов фильмов с использованием Sql2o
 * Обеспечивает доступ к данным сеансов через SQL-запросы
 *
 * @author Константин
 * @version 1.0
 */
@Repository
public class Sql2oFilmSessionRepository implements FilmSessionRepository {

    private final Sql2o sql2o;

    public Sql2oFilmSessionRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Optional<FilmSession> findById(int id) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM film_sessions WHERE id = :id");
            var session = query.addParameter("id", id)
                    .executeAndFetchFirst(FilmSession.class);
            return Optional.ofNullable(session);
        }
    }

    @Override
    public Collection<FilmSession> findAll() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM film_sessions");
            return query.executeAndFetch(FilmSession.class);
        }
    }
}