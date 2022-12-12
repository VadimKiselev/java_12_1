package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerPosterTest {
    private ManagerPoster manager = new ManagerPoster();

    private Poster first = new Poster(1, "Бладшот", "jpg", "action", false);
    private Poster second = new Poster(2, "Вперед", "jpg", "cartoon", false);
    private Poster third = new Poster(3, "Отель Белград", "jpg", "comedy", false);
    private Poster four = new Poster(4, "Джентельмены", "jpg", "action", false);
    private Poster five = new Poster(5, "Человек - невидимка", "jpg", "horror", false);
    private Poster six = new Poster(6, "Тролли. Мировой тур", "jpg", "cartoon", true);
    private Poster seven = new Poster(7, "Номер один", "jpg", "comedy", true);
    private Poster eight = new Poster(8, "Сердце Пармы", "jpg", "fantasy", true);
    private Poster nine = new Poster(9, "Черная Пантера 2: Ваканда на веки", "jpg", "fantasy", true);
    private Poster ten = new Poster(10, "Черный Адам", "jpg", "fantasy", true);

    void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
    }

    @Test
    public void shouldFindLastOver() {
        ManagerPoster manager = new ManagerPoster(9);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);


        Poster[] expected = new Poster[]{ten, nine, eight, seven, six, five, four, third, second};
        Poster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver1() {
        ManagerPoster manager = new ManagerPoster(11);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);


        Poster[] expected = new Poster[]{ten, nine, eight, seven, six, five, four, third, second, first};
        Poster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver2() {
        ManagerPoster manager = new ManagerPoster(12);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);

        Poster[] expected = new Poster[]{five, four, third, second, first};
        Poster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver3() {
        ManagerPoster manager = new ManagerPoster(9);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);

        Poster[] expected = new Poster[]{seven, six, five, four, third, second, first};
        Poster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }


}