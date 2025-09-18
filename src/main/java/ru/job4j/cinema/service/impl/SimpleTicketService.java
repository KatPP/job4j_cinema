package ru.job4j.cinema.service.impl;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.dto.TicketDto;
import ru.job4j.cinema.model.Film;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.model.Ticket;
import ru.job4j.cinema.repository.FilmRepository;
import ru.job4j.cinema.repository.FilmSessionRepository;
import ru.job4j.cinema.repository.TicketRepository;
import ru.job4j.cinema.service.TicketService;

import java.util.Optional;

/**
 * Реализация сервиса билетов
 * Обеспечивает бизнес-логику для работы с билетами
 *
 * @author Константин
 * @version 1.0
 */
@Service
public class SimpleTicketService implements TicketService {

    /**
     * Репозиторий билетов
     */
    private final TicketRepository ticketRepository;

    /**
     * Репозиторий сеансов
     */
    private final FilmSessionRepository filmSessionRepository;

    /**
     * Репозиторий фильмов
     */
    private final FilmRepository filmRepository;

    /**
     * Конструктор
     *
     * @param ticketRepository      репозиторий билетов
     * @param filmSessionRepository репозиторий сеансов
     * @param filmRepository        репозиторий фильмов
     */
    public SimpleTicketService(TicketRepository ticketRepository,
                               FilmSessionRepository filmSessionRepository,
                               FilmRepository filmRepository) {
        this.ticketRepository = ticketRepository;
        this.filmSessionRepository = filmSessionRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public Optional<Ticket> save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Optional<TicketDto> saveTicket(int sessionId, int rowNumber, int placeNumber, int userId) {
        // Проверяем, доступно ли место
        if (!ticketRepository.isPlaceAvailable(sessionId, rowNumber, placeNumber)) {
            return Optional.empty();
        }

        // Создаем билет
        Ticket ticket = new Ticket();
        ticket.setSessionId(sessionId);
        ticket.setRowNumber(rowNumber);
        ticket.setPlaceNumber(placeNumber);
        ticket.setUserId(userId);

        // Сохраняем билет
        Optional<Ticket> savedTicket = ticketRepository.save(ticket);

        if (savedTicket.isPresent()) {
            // Создаем DTO для возврата
            FilmSession session = filmSessionRepository.findById(sessionId).orElse(null);
            if (session != null) {
                Film film = filmRepository.findById(session.getFilmId()).orElse(null);
                if (film != null) {
                    TicketDto ticketDto = new TicketDto(
                            savedTicket.get().getId(),
                            film.getName(),
                            session.getStartTime(),
                            rowNumber,
                            placeNumber,
                            session.getPrice()
                    );
                    return Optional.of(ticketDto);
                }
            }
        }

        return Optional.empty();
    }

    @Override
    public boolean isPlaceAvailable(int sessionId, int rowNumber, int placeNumber) {
        return ticketRepository.isPlaceAvailable(sessionId, rowNumber, placeNumber);
    }
}