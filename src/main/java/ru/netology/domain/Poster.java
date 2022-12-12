package ru.netology.domain;

public class Poster {
    private int id;
    private String filmName;
    private String filmPicture;
    private String filmGenre;
    private boolean premiereTomorrow;

    public Poster(int id, String filmName, String filmPicture, String filmGenre, boolean premiereTomorrow) {
        this.id = id;
        this.filmName = filmName;
        this.filmPicture = filmPicture;
        this.filmGenre = filmGenre;
        this.premiereTomorrow = premiereTomorrow;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmPicture() {
        return filmPicture;
    }

    public void setFilmPicture(String filmPicture) {
        this.filmPicture = filmPicture;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}