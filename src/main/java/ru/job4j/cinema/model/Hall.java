package ru.job4j.cinema.model;

/**
 * Модель кинозала
 * Информацию о кинозале в кинотеатре
 *
 * @author Константин
 * @version 1.0
 */
public class Hall {

    /**
     * Уникальный идентификатор зала
     */
    private int id;

    /**
     * Название зала
     */
    private String name;

    /**
     * Количество рядов в зале
     */
    private int rowCount;

    /**
     * Количество мест в ряду
     */
    private int placeCount;

    /**
     * Описание зала
     */
    private String description;

    /**
     * Конструктор по умолчанию
     */
    public Hall() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id          уникальный идентификатор
     * @param name        название зала
     * @param rowCount    количество рядов
     * @param placeCount  количество мест в ряду
     * @param description описание зала
     */
    public Hall(int id, String name, int rowCount, int placeCount, String description) {
        this.id = id;
        this.name = name;
        this.rowCount = rowCount;
        this.placeCount = placeCount;
        this.description = description;
    }

    /**
     * Получает уникальный идентификатор зала
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор зала
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает название зала
     *
     * @return название зала
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название зала
     *
     * @param name название зала
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает количество рядов в зале
     *
     * @return количество рядов
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Устанавливает количество рядов в зале
     *
     * @param rowCount количество рядов
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Получает количество мест в ряду
     *
     * @return количество мест в ряду
     */
    public int getPlaceCount() {
        return placeCount;
    }

    /**
     * Устанавливает количество мест в ряду
     *
     * @param placeCount количество мест в ряду
     */
    public void setPlaceCount(int placeCount) {
        this.placeCount = placeCount;
    }

    /**
     * Получает описание зала
     *
     * @return описание зала
     */
    public String getDescription() {
        return description;
    }

    /**
     * Устанавливает описание зала
     *
     * @param description описание зала
     */
    public void setDescription(String description) {
        this.description = description;
    }
}