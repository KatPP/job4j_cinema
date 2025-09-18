package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Контроллер главной страницы
 * Обрабатывает запросы к главной странице приложения
 *
 * @author Константин
 * @version 1.0
 */
@Controller
public class IndexController {

    /**
     * Обрабатывает GET-запрос к главной странице
     *
     * @param model модель данных для передачи в представление
     * @return имя шаблона главной страницы
     */
    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("title", "Кинотеатр");
        return "index";
    }
}
