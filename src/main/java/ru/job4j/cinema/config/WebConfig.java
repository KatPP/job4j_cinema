package ru.job4j.cinema.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.job4j.cinema.filter.AuthorizationFilter;

/**
 * Конфигурационный класс для настройки веб-приложения
 * Обеспечивает регистрацию фильтров и других веб-компонентов
 *
 * @author Константин
 * @version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Фильтр авторизации
     */
    private final AuthorizationFilter authorizationFilter;

    /**
     * Конструктор
     *
     * @param authorizationFilter фильтр авторизации
     */
    public WebConfig(AuthorizationFilter authorizationFilter) {
        this.authorizationFilter = authorizationFilter;
    }

    /**
     * Добавляет фильтры для перехвата запросов
     *
     * @param registry реестр перехватчиков
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationFilter)
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/js/**", "/images/**", "/files/**");
    }
}