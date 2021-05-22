package Dane;

public class Elektronika {

    private Long elektronikaId;

    private String nazwa;

    private String producent;

    private String opis;

    private double cenaPolska;

    private double cenaSwiat;

    public Elektronika(Long elektronikaId, String nazwa, String producent, String opis, double cenaPolska, double cenaSwiat) {
        this.elektronikaId = elektronikaId;
        this.nazwa = nazwa;
        this.producent = producent;
        this.opis = opis;
        this.cenaPolska = cenaPolska;
        this.cenaSwiat = cenaSwiat;
    }

    public Long getElektronikaId() {
        return elektronikaId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCenaPolska() {
        return cenaPolska;
    }

    public void setCenaPolska(double cenaPolska) {
        this.cenaPolska = cenaPolska;
    }

    public double getCenaSwiat() {
        return cenaSwiat;
    }

    public void setCenaSwiat(double cenaSwiat) {
        this.cenaSwiat = cenaSwiat;
    }
}
