package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.cinema.service.FilmSessionService;

/**
 * Контроллер сеансов фильмов
 * Обрабатывает запросы, связанные с сеансами фильмов
 *
 * @author Константин
 * @version 1.0
 */
@Controller
@RequestMapping("/sessions")
public class FilmSessionController {

    /**
     * Сервис сеансов
     */
    private final FilmSessionService filmSessionService;

    /**
     * Конструктор
     *
     * @param filmSessionService сервис сеансов
     */
    public FilmSessionController(FilmSessionService filmSessionService) {
        this.filmSessionService = filmSessionService;
    }

    /**
     * Обрабатывает GET-запрос к списку сеансов
     *
     * @param model модель данных для передачи в представление
     * @return имя шаблона списка сеансов
     */
    @GetMapping
    public String getAllSessions(Model model) {
        model.addAttribute("sessions", filmSessionService.findAll());
        return "sessions/list";
    }

    /**
     * Обрабатывает GET-запрос к конкретному сеансу
     *
     * @param id    идентификатор сеанса
     * @param model модель данных для передачи в представление
     * @return имя шаблона просмотра сеанса
     */
    @GetMapping("/{id}")
    public String getSessionById(@PathVariable int id, Model model) {
        var session = filmSessionService.findById(id);
        if (session != null) {
            model.addAttribute("session", session);
            return "sessions/view";
        }
        return "redirect:/sessions";
    }

    /**
     * Обрабатывает GET-запрос на покупку билета
     *
     * @param id    идентификатор сеанса
     * @param model модель данных для передачи в представление
     * @return перенаправление на страницу покупки билета
     */
    @GetMapping("/buy/{id}")
    public String buyTicket(@PathVariable int id, Model model) {
        model.addAttribute("sessionId", id);
        return "redirect:/tickets/buy/" + id;
    }
}