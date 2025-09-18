package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.File;

import java.util.Optional;

/**
 * Интерфейс репозитория для работы с файлами
 * Предоставляет методы для доступа к данным файлов в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface FileRepository {

    /**
     * Находит файл по идентификатору
     *
     * @param id идентификатор файла
     * @return Optional с файлом, если найден, иначе пустой Optional
     */
    Optional<File> findById(int id);
}