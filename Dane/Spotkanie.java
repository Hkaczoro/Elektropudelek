package Dane;

import Funkcje.ZarzadzanieSpotkaniem;

import java.util.Date;

public class Spotkanie implements ZarzadzanieSpotkaniem {

    private Long spotkanieId;

    private Uzytkownik uzytkownik;

    private Ekspert ekspert;

    private Date data;

    @Override
    public void wyszukajEksperta() {

    }

    @Override
    public void zaplanujSpotkanie() {

    }

    @Override
    public void zmienDate() {

    }

    @Override
    public void wyslijWiadomosc() {

    }

    @Override
    public void utworzPolaczenie() {

    }

    @Override
    public void zakonczPolaczenie() {

    }

    public Spotkanie(Long spotkanieId, Uzytkownik uzytkownik, Ekspert ekspert, Date data) {
        this.spotkanieId = spotkanieId;
        this.uzytkownik = uzytkownik;
        this.ekspert = ekspert;
        this.data = data;
    }

    public Long getSpotkanieId() {
        return spotkanieId;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public Ekspert getEkspert() {
        return ekspert;
    }

    public void setEkspert(Ekspert ekspert) {
        this.ekspert = ekspert;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
