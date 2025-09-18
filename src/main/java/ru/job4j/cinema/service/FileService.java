package ru.job4j.cinema.service;

import ru.job4j.cinema.model.File;

import java.util.Optional;

/**
 * Интерфейс сервиса для работы с файлами
 * Предоставляет бизнес-логику для работы с файлами
 *
 * @author Константин
 * @version 1.0
 */
public interface FileService {

    /**
     * Находит файл по идентификатору
     *
     * @param id идентификатор файла
     * @return Optional с файлом, если найден, иначе пустой Optional
     */
    Optional<File> findById(int id);

    /**
     * Сохраняет файл
     *
     * @param name    имя файла
     * @param content содержимое файла
     * @return Optional с сохраненным файлом, если успешно, иначе пустой Optional
     */
    Optional<File> save(String name, byte[] content);
}