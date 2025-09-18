package ru.job4j.cinema.service;

import ru.job4j.cinema.dto.TicketDto;
import ru.job4j.cinema.model.Ticket;

import java.util.Optional;

/**
 * Интерфейс сервиса для работы с билетами
 * Предоставляет бизнес-логику для работы с билетами
 *
 * @author Константин
 * @version 1.0
 */
public interface TicketService {

    /**
     * Сохраняет билет
     *
     * @param ticket билет для сохранения
     * @return Optional с сохраненным билетом, если успешно, иначе пустой Optional
     */
    Optional<Ticket> save(Ticket ticket);

    /**
     * Сохраняет билет с проверкой доступности места
     *
     * @param sessionId   идентификатор сеанса
     * @param rowNumber   номер ряда
     * @param placeNumber номер места
     * @param userId      идентификатор пользователя
     * @return Optional с DTO билета, если успешно, иначе пустой Optional
     */
    Optional<TicketDto> saveTicket(int sessionId, int rowNumber, int placeNumber, int userId);

    /**
     * Проверяет доступность места
     *
     * @param sessionId   идентификатор сеанса
     * @param rowNumber   номер ряда
     * @param placeNumber номер места
     * @return true, если место доступно, иначе false
     */
    boolean isPlaceAvailable(int sessionId, int rowNumber, int placeNumber);
}