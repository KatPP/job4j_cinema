package ru.job4j.cinema.repository.impl;

import org.sql2o.Sql2o;
import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.User;
import ru.job4j.cinema.repository.UserRepository;

import java.util.Optional;

/**
 * Реализация репозитория пользователей с использованием Sql2o
 * Обеспечивает доступ к данным пользователей через SQL-запросы
 *
 * @author Константин
 * @version 1.0
 */
@Repository
public class Sql2oUserRepository implements UserRepository {

    private final Sql2o sql2o;

    public Sql2oUserRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Optional<User> save(User user) {
        try (var connection = sql2o.open()) {
            var sql = """
                    INSERT INTO users(full_name, email, password)
                    VALUES (:fullName, :email, :password)
                    """;
            var query = connection.createQuery(sql, true)
                    .addParameter("fullName", user.getFullName())
                    .addParameter("email", user.getEmail())
                    .addParameter("password", user.getPassword());
            int generatedId = query.executeUpdate().getKey(Integer.class);
            user.setId(generatedId);
            return Optional.of(user);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> findByEmailAndPassword(String email, String password) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery(
                    "SELECT * FROM users WHERE email = :email AND password = :password");
            var user = query.addParameter("email", email)
                    .addParameter("password", password)
                    .executeAndFetchFirst(User.class);
            return Optional.ofNullable(user);
        }
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM users WHERE email = :email");
            var user = query.addParameter("email", email)
                    .executeAndFetchFirst(User.class);
            return Optional.ofNullable(user);
        }
    }
}