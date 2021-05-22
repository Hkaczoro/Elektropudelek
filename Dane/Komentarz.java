package Dane;

import Funkcje.FukcjeForum;

import java.util.Date;

public class Komentarz implements FukcjeForum {

    private Long komentarzId;

    private Uzytkownik uzytkownik;

    private String tresc;

    private Date data;

    public Komentarz(Long komentarzId, Uzytkownik uzytkownik, String tresc, Date data) {
        this.komentarzId = komentarzId;
        this.uzytkownik = uzytkownik;
        this.tresc = tresc;
        this.data = data;
    }

    public Long getKomentarzId() {
        return komentarzId;
    }


    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Date getData() {
        return data;
    }

    @Override
    public void dodajPost() {

    }

    @Override
    public void usunPost() {

    }

    @Override
    public void dodajKomentarz() {

    }

    @Override
    public void obliczWspolczynnikAktywnosciUzytkownika() {

    }

    @Override
    public void zglosPost() {

    }

    @Override
    public void edytujPost() {

    }

    @Override
    public void edytujKomentarz() {

    }

    @Override
    public void dodajMem() {

    }
}
