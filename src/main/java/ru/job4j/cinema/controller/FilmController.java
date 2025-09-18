package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.cinema.service.FilmService;

/**
 * Контроллер фильмов
 * Обрабатывает запросы, связанные с фильмами
 *
 * @author Константин
 * @version 1.0
 */
@Controller
@RequestMapping("/films")
public class FilmController {

    /**
     * Сервис фильмов
     */
    private final FilmService filmService;

    /**
     * Конструктор
     *
     * @param filmService сервис фильмов
     */
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    /**
     * Обрабатывает GET-запрос к списку фильмов
     *
     * @param model модель данных для передачи в представление
     * @return имя шаблона списка фильмов
     */
    @GetMapping
    public String getAllFilms(Model model) {
        model.addAttribute("films", filmService.findAll());
        return "films/list";
    }
}