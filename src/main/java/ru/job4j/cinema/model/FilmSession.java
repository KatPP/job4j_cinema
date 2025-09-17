package ru.job4j.cinema.model;

import java.time.LocalDateTime;

/**
 * Модель сеанса фильма
 * Информация о показе фильма в определенное время
 *
 * @author Разработчик
 * @version 1.0
 */
public class FilmSession {

    /**
     * Уникальный идентификатор сеанса
     */
    private int id;

    /**
     * Идентификатор фильма
     */
    private int filmId;

    /**
     * Идентификатор зала
     */
    private int hallsId;

    /**
     * Время начала сеанса
     */
    private LocalDateTime startTime;

    /**
     * Время окончания сеанса
     */
    private LocalDateTime endTime;

    /**
     * Цена билета
     */
    private int price;

    /**
     * Конструктор по умолчанию
     */
    public FilmSession() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id        уникальный идентификатор
     * @param filmId    идентификатор фильма
     * @param hallsId   идентификатор зала
     * @param startTime время начала сеанса
     * @param endTime   время окончания сеанса
     * @param price     цена билета
     */
    public FilmSession(int id, int filmId, int hallsId, LocalDateTime startTime,
                       LocalDateTime endTime, int price) {
        this.id = id;
        this.filmId = filmId;
        this.hallsId = hallsId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    /**
     * Получает уникальный идентификатор сеанса
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор сеанса
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает идентификатор фильма
     *
     * @return идентификатор фильма
     */
    public int getFilmId() {
        return filmId;
    }

    /**
     * Устанавливает идентификатор фильма
     *
     * @param filmId идентификатор фильма
     */
    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    /**
     * Получает идентификатор зала
     *
     * @return идентификатор зала
     */
    public int getHallsId() {
        return hallsId;
    }

    /**
     * Устанавливает идентификатор зала
     *
     * @param hallsId идентификатор зала
     */
    public void setHallsId(int hallsId) {
        this.hallsId = hallsId;
    }

    /**
     * Получает время начала сеанса
     *
     * @return время начала сеанса
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Устанавливает время начала сеанса
     *
     * @param startTime время начала сеанса
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Получает время окончания сеанса
     *
     * @return время окончания сеанса
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Устанавливает время окончания сеанса
     *
     * @param endTime время окончания сеанса
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Получает цену билета
     *
     * @return цена билета
     */
    public int getPrice() {
        return price;
    }

    /**
     * Устанавливает цену билета
     *
     * @param price цена билета
     */
    public void setPrice(int price) {
        this.price = price;
    }
}