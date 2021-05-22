package Dane;

import Funkcje.FukcjeForum;

import java.util.Date;
import java.util.HashSet;

public class PostNaForum implements FukcjeForum {

    private Long postId;

    private String nazwa;

    private Uzytkownik uzytkownik;

    private HashSet<Komentarz> komentarze;

    private String tresc;

    private HashSet<String> tagi;

    private Date data;

    private String kategoria;

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

    public PostNaForum(Long postId, String nazwa, Uzytkownik uzytkownik, String tresc, HashSet<String> tagi, Date data, String kategoria) {
        this.postId = postId;
        this.nazwa = nazwa;
        this.uzytkownik = uzytkownik;
        this.tresc = tresc;
        this.tagi = tagi;
        this.data = data;
        this.kategoria = kategoria;
    }

    public Long getPostId() {
        return postId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public HashSet<Komentarz> getKomentarze() {
        return komentarze;
    }

    public void setKomentarze(HashSet<Komentarz> komentarze) {
        this.komentarze = komentarze;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public HashSet<String> getTagi() {
        return tagi;
    }

    public void setTagi(HashSet<String> tagi) {
        this.tagi = tagi;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
