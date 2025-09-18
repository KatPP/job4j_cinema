package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.User;

import java.util.Optional;

/**
 * Интерфейс репозитория для работы с пользователями
 * Предоставляет методы для доступа к данным пользователей в базе данных
 *
 * @author Разработчик
 * @version 1.0
 */
public interface UserRepository {

    /**
     * Сохраняет нового пользователя
     *
     * @param user пользователь для сохранения
     * @return Optional с сохраненным пользователем, если успешно, иначе пустой Optional
     */
    Optional<User> save(User user);

    /**
     * Находит пользователя по email и паролю
     *
     * @param email    email пользователя
     * @param password пароль пользователя
     * @return Optional с пользователем, если найден, иначе пустой Optional
     */
    Optional<User> findByEmailAndPassword(String email, String password);

    /**
     * Находит пользователя по email
     *
     * @param email email пользователя
     * @return Optional с пользователем, если найден, иначе пустой Optional
     */
    Optional<User> findByEmail(String email);
}