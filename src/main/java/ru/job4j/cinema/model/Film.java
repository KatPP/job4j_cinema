package ru.job4j.cinema.model;

/**
 * Модель фильма
 *
 * @author Константин
 * @version 1.0
 */
public class Film {

    /** Уникальный идентификатор фильма */
    private int id;

    /** Название фильма */
    private String name;

    /** Описание фильма */
    private String description;

    /** Год выпуска фильма */
    private int year;

    /** Идентификатор жанра фильма */
    private int genreId;

    /** Минимальный возраст для просмотра */
    private int minimalAge;

    /** Длительность фильма в минутах */
    private int durationInMinutes;

    /** Идентификатор файла постера */
    private int fileId;

    /**
     * Конструктор по умолчанию
     */
    public Film() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id уникальный идентификатор
     * @param name название фильма
     * @param description описание фильма
     * @param year год выпуска
     * @param genreId идентификатор жанра
     * @param minimalAge минимальный возраст
     * @param durationInMinutes длительность в минутах
     * @param fileId идентификатор файла постера
     */
    public Film(int id, String name, String description, int year, int genreId,
                int minimalAge, int durationInMinutes, int fileId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.genreId = genreId;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
        this.fileId = fileId;
    }

    /**
     * Получает уникальный идентификатор фильма
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор фильма
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает название фильма
     *
     * @return название фильма
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название фильма
     *
     * @param name название фильма
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает описание фильма
     *
     * @return описание фильма
     */
    public String getDescription() {
        return description;
    }

    /**
     * Устанавливает описание фильма
     *
     * @param description описание фильма
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Получает год выпуска фильма
     *
     * @return год выпуска
     */
    public int getYear() {
        return year;
    }

    /**
     * Устанавливает год выпуска фильма
     *
     * @param year год выпуска
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Получает идентификатор жанра фильма
     *
     * @return идентификатор жанра
     */
    public int getGenreId() {
        return genreId;
    }

    /**
     * Устанавливает идентификатор жанра фильма
     *
     * @param genreId идентификатор жанра
     */
    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    /**
     * Получает минимальный возраст для просмотра
     *
     * @return минимальный возраст
     */
    public int getMinimalAge() {
        return minimalAge;
    }

    /**
     * Устанавливает минимальный возраст для просмотра
     *
     * @param minimalAge минимальный возраст
     */
    public void setMinimalAge(int minimalAge) {
        this.minimalAge = minimalAge;
    }

    /**
     * Получает длительность фильма в минутах
     *
     * @return длительность в минутах
     */
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * Устанавливает длительность фильма в минутах
     *
     * @param durationInMinutes длительность в минутах
     */
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * Получает идентификатор файла постера
     *
     * @return идентификатор файла
     */
    public int getFileId() {
        return fileId;
    }

    /**
     * Устанавливает идентификатор файла постера
     *
     * @param fileId идентификатор файла
     */
    public void setFileId(int fileId) {
        this.fileId = fileId;
    }
}