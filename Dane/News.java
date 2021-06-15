package Dane;

import java.util.Date;
import java.util.HashSet;

public class News {

    private String nazwa;

    private String tresc;

    private HashSet<String> tagi;

    private Long newsId;

    private Date dataDodania;

    private String kategoria;

    private String imgSource;

    public News(String nazwa, String tresc, HashSet<String> tagi, Long newsId, Date dataDodania, String kategoria) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.tagi = tagi;
        this.newsId = newsId;
        this.dataDodania = dataDodania;
        this.kategoria = kategoria;
    }
    public News(){

    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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

    public Long getNewsId() {
        return newsId;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
