package ru.job4j.cinema.filter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * Фильтр авторизации
 * Перехватывает запросы и проверяет, авторизован ли пользователь
 *
 * @author Константин
 * @version 1.0
 */
@Component
public class AuthorizationFilter implements HandlerInterceptor {

    /**
     * Выполняется перед обработкой запроса
     * Проверяет авторизацию пользователя
     *
     * @param request  HTTP запрос
     * @param response HTTP ответ
     * @param handler  обработчик запроса
     * @return true, если запрос может быть обработан, иначе false
     * @throws Exception если возникает ошибка
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();

        // Разрешаем доступ к этим страницам всем пользователям
        if (uri.startsWith("/users/login") ||
                uri.startsWith("/users/register") ||
                uri.startsWith("/index") ||
                uri.equals("/") ||
                uri.startsWith("/css/") ||
                uri.startsWith("/js/") ||
                uri.startsWith("/images/") ||
                uri.startsWith("/files/")) {
            return true;
        }

        // Проверяем, авторизован ли пользователь
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");

        if (user == null) {
            // Если не авторизован и пытается купить билет - перенаправляем на вход
            if (uri.startsWith("/tickets")) {
                response.sendRedirect("/users/login");
                return false;
            }
        }

        return true;
    }
}