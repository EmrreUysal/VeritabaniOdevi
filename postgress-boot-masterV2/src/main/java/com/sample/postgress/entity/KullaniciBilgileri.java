package com.sample.postgress.entity;

public class KullaniciBilgileri {

    int kullanici_no;
    int telefon;
    int sehir_no;
    String ulke;

    public int getKullanici_no() {
        return kullanici_no;
    }

    public void setKullanici_no(int kullanici_no) {
        this.kullanici_no = kullanici_no;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getSehir_no() {
        return sehir_no;
    }

    public void setSehir_no(int sehir_no) {
        this.sehir_no = sehir_no;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }


}
