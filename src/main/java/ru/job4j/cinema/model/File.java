package ru.job4j.cinema.model;

/**
 * Модель файла (постера фильма)
 * Файл, хранящийся в системе
 *
 * @author Константин
 * @version 1.0
 */
public class File {

    /**
     * Уникальный идентификатор файла
     */
    private int id;

    /**
     * Имя файла
     */
    private String name;

    /**
     * Путь к файлу
     */
    private String path;

    /**
     * Конструктор по умолчанию
     */
    public File() {
    }

    /**
     * Конструктор с параметрами
     *
     * @param id   уникальный идентификатор
     * @param name имя файла
     * @param path путь к файлу
     */
    public File(int id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    /**
     * Получает уникальный идентификатор файла
     *
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор файла
     *
     * @param id уникальный идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает имя файла
     *
     * @return имя файла
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя файла
     *
     * @param name имя файла
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает путь к файлу
     *
     * @return путь к файлу
     */
    public String getPath() {
        return path;
    }

    /**
     * Устанавливает путь к файлу
     *
     * @param path путь к файлу
     */
    public void setPath(String path) {
        this.path = path;
    }
}