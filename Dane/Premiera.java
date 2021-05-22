package Dane;

import java.util.Date;

public class Premiera {

    private Long premieraId;

    private String nazwa;

    private Date data;

    private String kategoria;

    public Premiera(Long premieraId, String nazwa, Date data, String kategoria) {
        this.premieraId = premieraId;
        this.nazwa = nazwa;
        this.data = data;
        this.kategoria = kategoria;
    }

    public Long getPremieraId() {
        return premieraId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
