package ru.job4j.cinema.repository.impl;

import org.sql2o.Sql2o;
import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Ticket;
import ru.job4j.cinema.repository.TicketRepository;

import java.util.Optional;

/**
 * Реализация репозитория билетов с использованием Sql2o
 * Обеспечивает доступ к данным билетов через SQL-запросы
 *
 * @author Константин
 * @version 1.0
 */
@Repository
public class Sql2oTicketRepository implements TicketRepository {

    private final Sql2o sql2o;

    public Sql2oTicketRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Optional<Ticket> save(Ticket ticket) {
        try (var connection = sql2o.open()) {
            var sql = """
                    INSERT INTO tickets(session_id, row_number, place_number, user_id)
                    VALUES (:sessionId, :rowNumber, :placeNumber, :userId)
                    """;
            var query = connection.createQuery(sql, true)
                    .addParameter("sessionId", ticket.getSessionId())
                    .addParameter("rowNumber", ticket.getRowNumber())
                    .addParameter("placeNumber", ticket.getPlaceNumber())
                    .addParameter("userId", ticket.getUserId());
            int generatedId = query.executeUpdate().getKey(Integer.class);
            ticket.setId(generatedId);
            return Optional.of(ticket);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public boolean isPlaceAvailable(int sessionId, int rowNumber, int placeNumber) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery(
                    "SELECT COUNT(*) FROM tickets WHERE session_id = :sessionId AND row_number = :rowNumber AND place_number = :placeNumber");
            Integer count = query.addParameter("sessionId", sessionId)
                    .addParameter("rowNumber", rowNumber)
                    .addParameter("placeNumber", placeNumber)
                    .executeScalar(Integer.class);
            return count == 0;
        }
    }
}