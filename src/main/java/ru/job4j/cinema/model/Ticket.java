package ru.job4j.cinema.model;

/**
 * Модель билета
 * Информация о купленном билете
 *
 * @author Константин
 * @version 1.0
 */
public class Ticket {

    /**
     * Уникальный идентификатор билета
     */
    private int id;

    /**
     * Идентификатор сеанса
     */
    private int sessionId;

    /**
     * Номер ряда
     */
    private int rowNumber;

    /**
     * Номер места
     */
    private int placeNumber;

    /**
     * Идентификатор пользователя
     */
    private int userId;

    /**
     * Конструктор по умолчанию
     */
    public Ticket() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id          уникальный идентификатор
     * @param sessionId   идентификатор сеанса
     * @param rowNumber   номер ряда
     * @param placeNumber номер места
     * @param userId      идентификатор пользователя
     */
    public Ticket(int id, int sessionId, int rowNumber, int placeNumber, int userId) {
        this.id = id;
        this.sessionId = sessionId;
        this.rowNumber = rowNumber;
        this.placeNumber = placeNumber;
        this.userId = userId;
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
     * Получает идентификатор сеанса
     *
     * @return идентификатор сеанса
     */
    public int getSessionId() {
        return sessionId;
    }

    /**
     * Устанавливает идентификатор сеанса
     *
     * @param sessionId идентификатор сеанса
     */
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
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
     * Получает идентификатор пользователя
     *
     * @return идентификатор пользователя
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Устанавливает идентификатор пользователя
     *
     * @param userId идентификатор пользователя
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
}