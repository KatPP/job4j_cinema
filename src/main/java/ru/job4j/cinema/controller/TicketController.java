package ru.job4j.cinema.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.model.Hall;
import ru.job4j.cinema.service.FilmSessionService;
import ru.job4j.cinema.service.HallService;
import ru.job4j.cinema.service.TicketService;


/**
 * Контроллер билетов
 * Обрабатывает запросы, связанные с покупкой билетов
 *
 * @author Разработчик
 * @version 1.0
 */
@Controller
@RequestMapping("/tickets")
public class TicketController {

    /**
     * Сервис билетов
     */
    private final TicketService ticketService;

    /**
     * Сервис сеансов
     */
    private final FilmSessionService filmSessionService;

    /**
     * Сервис кинозалов
     */
    private final HallService hallService;

    /**
     * Конструктор
     *
     * @param ticketService      сервис билетов
     * @param filmSessionService сервис сеансов
     * @param hallService        сервис кинозалов
     */
    public TicketController(TicketService ticketService,
                            FilmSessionService filmSessionService,
                            HallService hallService) {
        this.ticketService = ticketService;
        this.filmSessionService = filmSessionService;
        this.hallService = hallService;
    }

    /**
     * Обрабатывает GET-запрос к форме покупки билета
     *
     * @param sessionId идентификатор сеанса
     * @param model     модель данных для передачи в представление
     * @param session   HTTP сессия
     * @return имя шаблона формы покупки билета
     */
    @GetMapping("/buy/{sessionId}")
    public String showBuyTicketForm(@PathVariable int sessionId, Model model, HttpSession session) {
        // Проверяем авторизацию
        var user = session.getAttribute("user");
        if (user == null) {
            return "redirect:/users/login";
        }

        FilmSession filmSession = filmSessionService.findById(sessionId);
        if (filmSession == null) {
            return "redirect:/sessions";
        }

        Hall hall = hallService.findById(filmSession.getHallsId());

        model.addAttribute("session", filmSession);
        model.addAttribute("hall", hall);
        model.addAttribute("rowCount", hall.getRowCount());
        model.addAttribute("placeCount", hall.getPlaceCount());

        return "tickets/buy";
    }

    /**
     * Обрабатывает POST-запрос на покупку билета
     *
     * @param sessionId   идентификатор сеанса
     * @param rowNumber   номер ряда
     * @param placeNumber номер места
     * @param session     HTTP сессия
     * @param model       модель данных для передачи в представление
     * @return имя шаблона результата покупки
     */
    @PostMapping("/buy")
    public String buyTicket(@RequestParam int sessionId,
                            @RequestParam int rowNumber,
                            @RequestParam int placeNumber,
                            HttpSession session,
                            Model model) {
        // Проверяем авторизацию
        var user = (ru.job4j.cinema.model.User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/users/login";
        }

        // Пытаемся купить билет
        var ticketResult = ticketService.saveTicket(sessionId, rowNumber, placeNumber, user.getId());

        if (ticketResult.isPresent()) {
            model.addAttribute("ticket", ticketResult.get());
            return "tickets/success";
        } else {
            model.addAttribute("errorMessage",
                    "Не удалось приобрести билет на заданное место. Вероятно оно уже занято.");
            return "tickets/failure";
        }
    }
}