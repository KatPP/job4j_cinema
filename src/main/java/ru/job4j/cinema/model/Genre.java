package ru.job4j.cinema.model;

/**
 * Модель жанра фильма
 *
 * @author Константин
 * @version 1.0
 */
public class Genre {

    /**
     * Уникальный идентификатор жанра
     */
    private int id;

    /**
     * Название жанра
     */
    private String name;

    /**
     * Конструктор по умолчанию
     */
    public Genre() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id   уникальный идентификатор
     * @param name название жанра
     */
    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Получает уникальный идентификатор жанра
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор жанра
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает название жанра
     *
     * @return название жанра
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название жанра
     *
     * @param name название жанра
     */
    public void setName(String name) {
        this.name = name;
    }
}