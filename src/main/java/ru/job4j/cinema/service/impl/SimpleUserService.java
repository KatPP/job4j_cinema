package ru.job4j.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.User;
import ru.job4j.cinema.repository.UserRepository;
import ru.job4j.cinema.service.UserService;

import java.util.Optional;

/**
 * Реализация сервиса пользователей
 * Обеспечивает бизнес-логику для работы с пользователями
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleUserService implements UserService {

    /**
     * Репозиторий пользователей
     */
    private final UserRepository userRepository;

    /**
     * Конструктор
     *
     * @param userRepository репозиторий пользователей
     */
    public SimpleUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}