package ru.job4j.cinema.service;

import ru.job4j.cinema.model.User;

import java.util.Optional;

/**
 * Интерфейс сервиса для работы с пользователями
 * Предоставляет бизнес-логику для работы с пользователями
 *
 * @author Константин
 * @version 1.0
 */
public interface UserService {

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
}