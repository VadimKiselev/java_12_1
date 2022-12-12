package ru.netology.manager;

import ru.netology.domain.Poster;

public class ManagerPoster {
    private Poster[] films;
    private int filmsNumber;


    public void addFilm(Poster film) {
        Poster[] collection = new Poster[films.length + 1];
        System.arraycopy(films, 0, collection, 0, films.length);
        collection[collection.length - 1] = film;
        films = collection;
    }


    public ManagerPoster(int filmsNumber) {
        this.filmsNumber = filmsNumber;
        this.films = new Poster[0];
    }

    public ManagerPoster() {
        this(10);
    }

    public Poster[] findAll() {
        int resultLength;
        if (films.length > filmsNumber) {
            resultLength = filmsNumber;
        } else {
            resultLength = films.length;
        }
        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


}