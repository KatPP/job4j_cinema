package ru.job4j.cinema.model;

/**
 * Модель пользователя
 * Информация о зарегистрированном пользователе
 *
 * @author Константин
 * @version 1.0
 */
public class User {

    /**
     * Уникальный идентификатор пользователя
     */
    private int id;

    /**
     * Полное имя пользователя
     */
    private String fullName;

    /**
     * Email пользователя
     */
    private String email;

    /**
     * Пароль пользователя
     */
    private String password;

    /**
     * Конструктор по умолчанию
     */
    public User() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id       уникальный идентификатор
     * @param fullName полное имя
     * @param email    email пользователя
     * @param password пароль
     */
    public User(int id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    /**
     * Получает уникальный идентификатор пользователя
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор пользователя
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает полное имя пользователя
     *
     * @return полное имя
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает полное имя пользователя
     *
     * @param fullName полное имя
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Получает email пользователя
     *
     * @return email пользователя
     */
    public String getEmail() {
        return email;
    }

    /**
     * Устанавливает email пользователя
     *
     * @param email email пользователя
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Получает пароль пользователя
     *
     * @return пароль пользователя
     */
    public String getPassword() {
        return password;
    }

    /**
     * Устанавливает пароль пользователя
     *
     * @param password пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }
}