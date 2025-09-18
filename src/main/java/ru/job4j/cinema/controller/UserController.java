package ru.job4j.cinema.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.cinema.model.User;
import ru.job4j.cinema.service.UserService;


/**
 * Контроллер пользователей
 * Обрабатывает запросы, связанные с регистрацией и входом пользователей
 *
 * @author Константин
 * @version 1.0
 */
@Controller
@RequestMapping("/users")
public class UserController {

    /**
     * Сервис пользователей
     */
    private final UserService userService;

    /**
     * Конструктор
     *
     * @param userService сервис пользователей
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Обрабатывает GET-запрос к странице регистрации
     *
     * @return имя шаблона страницы регистрации
     */
    @GetMapping("/register")
    public String getRegistrationPage() {
        return "users/register";
    }

    /**
     * Обрабатывает POST-запрос на регистрацию пользователя
     *
     * @param fullName полное имя пользователя
     * @param email    email пользователя
     * @param password пароль пользователя
     * @param model    модель данных для передачи в представление
     * @return имя шаблона или перенаправление
     */
    @PostMapping("/register")
    public String registerUser(@RequestParam String fullName,
                               @RequestParam String email,
                               @RequestParam String password,
                               Model model) {
        var user = new User();
        user.setFullName(fullName);
        user.setEmail(email);
        user.setPassword(password);

        var savedUser = userService.save(user);
        if (savedUser.isPresent()) {
            return "redirect:/login";
        }
        model.addAttribute("message", "Пользователь с таким email уже существует");
        return "users/register";
    }

    /**
     * Обрабатывает GET-запрос к странице входа
     *
     * @return имя шаблона страницы входа
     */
    @GetMapping("/login")
    public String getLoginPage() {
        return "users/login";
    }

    /**
     * Обрабатывает POST-запрос на вход пользователя
     *
     * @param email    email пользователя
     * @param password пароль пользователя
     * @param session  HTTP сессия
     * @param model    модель данных для передачи в представление
     * @return имя шаблона или перенаправление
     */
    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            HttpSession session,
                            Model model) {
        var user = userService.findByEmailAndPassword(email, password);
        if (user.isPresent()) {
            session.setAttribute("user", user.get());
            return "redirect:/index";
        }
        model.addAttribute("error", "Неправильный email или пароль");
        return "users/login";
    }

    /**
     * Обрабатывает GET-запрос на выход пользователя
     *
     * @param session HTTP сессия
     * @return перенаправление на главную страницу
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index";
    }
}