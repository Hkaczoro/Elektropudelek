package Dane;

import java.util.HashSet;

public class Ekspert {

    private String ekspertId;

    private String imie;

    private String nazwisko;

    private HashSet<String> dziedzinyEksperta;

    public Ekspert(String ekspertId, String imie, String nazwisko, HashSet<String> dziedzinyEksperta) {
        this.ekspertId = ekspertId;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dziedzinyEksperta = dziedzinyEksperta;
    }

    public String getEkspertId() {
        return ekspertId;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public HashSet<String> getDziedzinyEksperta() {
        return dziedzinyEksperta;
    }

    public void setDziedzinyEksperta(HashSet<String> dziedzinyEksperta) {
        this.dziedzinyEksperta = dziedzinyEksperta;
    }
}
