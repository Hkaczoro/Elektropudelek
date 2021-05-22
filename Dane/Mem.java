package Dane;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.HashSet;

public class Mem {

    private Long memId;

    private BufferedImage mem;

    private Uzytkownik uzytkownik;

    private double ocena;

    private HashSet<Komentarz> komentarze;

    private Date data;

    private HashSet<String> tagi;

    public Mem(Long memId, BufferedImage mem, Uzytkownik uzytkownik, double ocena, HashSet<Komentarz> komentarze, Date data, HashSet<String> tagi) {
        this.memId = memId;
        this.mem = mem;
        this.uzytkownik = uzytkownik;
        this.ocena = ocena;
        this.komentarze = komentarze;
        this.data = data;
        this.tagi = tagi;
    }

    public Long getMemId() {
        return memId;
    }

    public BufferedImage getMem() {
        return mem;
    }

    public void setMem(BufferedImage mem) {
        this.mem = mem;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public HashSet<Komentarz> getKomentarze() {
        return komentarze;
    }

    public void setKomentarze(HashSet<Komentarz> komentarze) {
        this.komentarze = komentarze;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public HashSet<String> getTagi() {
        return tagi;
    }

    public void setTagi(HashSet<String> tagi) {
        this.tagi = tagi;
    }
}
