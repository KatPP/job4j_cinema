package ru.job4j.cinema.dto;

/**
 * DTO для отображения информации о фильме
 * Используется для передачи данных между слоями приложения
 * Содержит дополнительную информацию, необходимую для отображения
 *
 * @author Константин
 * @version 1.0
 */
public class FilmDto {

    /**
     * Уникальный идентификатор фильма
     */
    private int id;

    /**
     * Название фильма
     */
    private String name;

    /**
     * Описание фильма
     */
    private String description;

    /**
     * Год выпуска фильма
     */
    private int year;

    /**
     * Минимальный возраст для просмотра
     */
    private int minimalAge;

    /**
     * Длительность фильма в минутах
     */
    private int durationInMinutes;

    /**
     * Название жанра фильма
     */
    private String genre;

    /**
     * Путь к постеру фильма
     */
    private String posterPath;

    /**
     * Конструктор по умолчанию
     */
    public FilmDto() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id                уникальный идентификатор
     * @param name              название фильма
     * @param description       описание фильма
     * @param year              год выпуска
     * @param minimalAge        минимальный возраст
     * @param durationInMinutes длительность в минутах
     * @param genre             название жанра
     * @param posterPath        путь к постеру
     */
    public FilmDto(int id, String name, String description, int year,
                   int minimalAge, int durationInMinutes, String genre, String posterPath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.minimalAge = minimalAge;
        this.durationInMinutes = durationInMinutes;
        this.genre = genre;
        this.posterPath = posterPath;
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
     * Получает название жанра фильма
     *
     * @return название жанра
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Устанавливает название жанра фильма
     *
     * @param genre название жанра
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Получает путь к постеру фильма
     *
     * @return путь к постеру
     */
    public String getPosterPath() {
        return posterPath;
    }

    /**
     * Устанавливает путь к постеру фильма
     *
     * @param posterPath путь к постеру
     */
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}