package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Ticket;
import java.util.Optional;

/**
 * Интерфейс репозитория для работы с билетами
 * Предоставляет методы для доступа к данным билетов в базе данных
 *
 * @author Константин
 * @version 1.0
 */
public interface TicketRepository {

    /**
     * Сохраняет новый билет
     *
     * @param ticket билет для сохранения
     * @return Optional с сохраненным билетом, если успешно, иначе пустой Optional
     */
    Optional<Ticket> save(Ticket ticket);

    /**
     * Проверяет доступность места
     *
     * @param sessionId идентификатор сеанса
     * @param rowNumber номер ряда
     * @param placeNumber номер места
     * @return true, если место доступно, иначе false
     */
    boolean isPlaceAvailable(int sessionId, int rowNumber, int placeNumber);
}