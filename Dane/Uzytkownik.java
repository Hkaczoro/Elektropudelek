package Dane;

import Funkcje.Logowanie;

public class Uzytkownik implements Logowanie {

    private String uzytkownikId;

    private String login;

    private String haslo;

    private double wspolczynnikAktywnosci;

    @Override
    public void zarejestrujUzytkownika() {

    }

    @Override
    public void zaloguj() {

    }

    @Override
    public void zmienHaslo() {

    }

    @Override
    public void zmienLogin() {

    }

    public Uzytkownik(String uzytkownikId, String login, String haslo) {
        this.uzytkownikId = uzytkownikId;
        this.login = login;
        this.haslo = haslo;
    }

    public String getUzytkownikId() {
        return uzytkownikId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public double getWspolczynnikAktywnosci() {
        return wspolczynnikAktywnosci;
    }

    public void setWspolczynnikAktywnosci(double wspolczynnikAktywnosci) {
        this.wspolczynnikAktywnosci = wspolczynnikAktywnosci;
    }
}
