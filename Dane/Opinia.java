package Dane;

import Funkcje.FunkcjeOpinie;

public class Opinia implements FunkcjeOpinie {

    private Long opiniaId;

    private String tresc;

    private String tytul;

    private Elektronika elektronika;

    private Ekspert ekspert;

    public Opinia(Long opiniaId, String tresc, String tytul, Elektronika elektronika, Ekspert ekspert) {
        this.opiniaId = opiniaId;
        this.tresc = tresc;
        this.tytul = tytul;
        this.elektronika = elektronika;
        this.ekspert = ekspert;
    }

    public Long getOpiniaId() {
        return opiniaId;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Elektronika getElektronika() {
        return elektronika;
    }

    public void setElektronika(Elektronika elektronika) {
        this.elektronika = elektronika;
    }

    public Ekspert getEkspert() {
        return ekspert;
    }

    public void setEkspert(Ekspert ekspert) {
        this.ekspert = ekspert;
    }

    @Override
    public void wyszukajPoKategorii() {
        
    }

    @Override
    public void wyszukajPoEkspercie() {

    }

    @Override
    public void wyszukajPoNazwie() {

    }
}
