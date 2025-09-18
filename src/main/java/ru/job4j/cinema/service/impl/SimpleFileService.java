package ru.job4j.cinema.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.File;
import ru.job4j.cinema.repository.FileRepository;
import ru.job4j.cinema.service.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.UUID;

/**
 * Реализация сервиса файлов
 * Обеспечивает бизнес-логику для работы с файлами
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleFileService implements FileService {

    /**
     * Репозиторий файлов
     */
    private final FileRepository fileRepository;

    /**
     * Путь для загрузки файлов
     */
    @Value("${app.upload.path}")
    private String uploadPath;


    public SimpleFileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public Optional<File> findById(int id) {
        return fileRepository.findById(id);
    }

    @Override
    public Optional<File> save(String name, byte[] content) {
        try {
            // Создаем уникальное имя файла
            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "." + name;

            // Создаем путь для сохранения
            Path uploadDir = Paths.get(uploadPath);
            if (!Files.exists(uploadDir)) {
                Files.createDirectories(uploadDir);
            }

            // Сохраняем файл
            Path filePath = uploadDir.resolve(resultFilename);
            Files.write(filePath, content);

            // Создаем запись в БД
            File file = new File();
            file.setName(name);
            file.setPath("/files/" + resultFilename);

            // Здесь нужно реализовать сохранение в репозиторий
            // Пока возвращаем mock

            return Optional.of(file);
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}