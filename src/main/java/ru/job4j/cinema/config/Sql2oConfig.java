package ru.job4j.cinema.config;

import org.sql2o.Sql2o;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Конфигурационный класс для настройки Sql2o
 * Обеспечивает создание бина Sql2o для работы с базой данных
 *
 * @author Константин
 * @version 1.0
 */
@Configuration
public class Sql2oConfig {

    /**
     * Создает бин Sql2o для работы с базой данных
     *
     * @param url URL базы данных
     * @param username имя пользователя базы данных
     * @param password пароль пользователя базы данных
     * @return бин Sql2o
     */
    @Bean
    public Sql2o sql2o(@Value("${spring.datasource.url}") String url,
                       @Value("${spring.datasource.username}") String username,
                       @Value("${spring.datasource.password}") String password) {
        return new Sql2o(url, username, password);
    }
}