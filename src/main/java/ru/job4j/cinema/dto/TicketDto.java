package ru.job4j.cinema.dto;

import java.time.LocalDateTime;

/**
 * DTO для отображения информации о билете
 * Используется для передачи данных между слоями приложения
 * Содержит информацию о билете для отображения пользователю
 *
 * @author Константин
 * @version 1.0
 */
public class TicketDto {

    /**
     * Уникальный идентификатор билета
     */
    private int id;

    /**
     * Название фильма
     */
    private String filmName;

    /**
     * Время сеанса
     */
    private LocalDateTime sessionTime;

    /**
     * Номер ряда
     */
    private int rowNumber;

    /**
     * Номер места
     */
    private int placeNumber;

    /**
     * Цена билета
     */
    private int price;

    /**
     * Конструктор по умолчанию
     */
    public TicketDto() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id          уникальный идентификатор билета
     * @param filmName    название фильма
     * @param sessionTime время сеанса
     * @param rowNumber   номер ряда
     * @param placeNumber номер места
     * @param price       цена билета
     */
    public TicketDto(int id, String filmName, LocalDateTime sessionTime,
                     int rowNumber, int placeNumber, int price) {
        this.id = id;
        this.filmName = filmName;
        this.sessionTime = sessionTime;
        this.rowNumber = rowNumber;
        this.placeNumber = placeNumber;
        this.price = price;
    }

    /**
     * Получает уникальный идентификатор билета
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор билета
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
    public String getFilmName() {
        return filmName;
    }

    /**
     * Устанавливает название фильма
     *
     * @param filmName название фильма
     */
    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    /**
     * Получает время сеанса
     *
     * @return время сеанса
     */
    public LocalDateTime getSessionTime() {
        return sessionTime;
    }

    /**
     * Устанавливает время сеанса
     *
     * @param sessionTime время сеанса
     */
    public void setSessionTime(LocalDateTime sessionTime) {
        this.sessionTime = sessionTime;
    }

    /**
     * Получает номер ряда
     *
     * @return номер ряда
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Устанавливает номер ряда
     *
     * @param rowNumber номер ряда
     */
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * Получает номер места
     *
     * @return номер места
     */
    public int getPlaceNumber() {
        return placeNumber;
    }

    /**
     * Устанавливает номер места
     *
     * @param placeNumber номер места
     */
    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
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