--liquibase formatted sql

--changeset test-1
INSERT INTO genres (name)
VALUES ('Боевик'),
       ('Комедия'),
       ('Драма'),
       ('Фантастика'),
       ('Триллер');

INSERT INTO files (name, path)
VALUES ('interstellar.jpg', '/files/interstellar.jpg'),
       ('inception.jpg', '/files/inception.jpg'),
       ('matrix.jpg', '/files/matrix.jpg');

INSERT INTO films (name, description, "year", genre_id, minimal_age, duration_in_minutes, file_id)
VALUES ('Интерстеллар', 'Фантастический эпос о путешествии через червоточину', 2014, 4, 12, 169, 1),
       ('Начало', 'Триллер о проникновении в подсознание', 2010, 5, 16, 148, 2),
       ('Матрица', 'Боевик о виртуальной реальности', 1999, 1, 16, 136, 3);

INSERT INTO halls (name, row_count, place_count, description)
VALUES ('Зал 1', 10, 15, 'Основной зал с отличным звуком'),
       ('Зал 2', 8, 12, 'VIP зал с комфортными креслами');

INSERT INTO film_sessions (film_id, halls_id, start_time, end_time, price)
VALUES (1, 1, '2024-01-15 18:00:00', '2024-01-15 21:00:00', 300),
       (2, 1, '2024-01-15 21:30:00', '2024-01-15 24:00:00', 250),
       (3, 2, '2024-01-16 19:00:00', '2024-01-16 21:30:00', 200);

INSERT INTO users (full_name, email, password)
VALUES ('Иван Иванов', 'ivan@example.com', 'password123');