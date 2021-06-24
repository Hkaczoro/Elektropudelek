package Dane;

import Funkcje.FunkcjeOpinie;

import javax.print.DocFlavor;

public class Opinia implements FunkcjeOpinie {

    private Long opiniaId;

    private String tresc;

    private String tytul;

    private Elektronika elektronika;

    private String ekspert;

    private String elektro;

    public Opinia(Long opiniaId, String tresc, String tytul, Elektronika elektronika, String ekspert) {
        this.opiniaId = opiniaId;
        this.tresc = tresc;
        this.tytul = tytul;
        this.elektronika = elektronika;
        this.ekspert = ekspert;
    }

    public Opinia(){

    }

    public String getElektro() {
        return elektro;
    }

    public void setElektro(String elektro) {
        this.elektro = elektro;
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

    public String getEkspert() {
        return ekspert;
    }

    public void setEkspert(String ekspert) {
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
