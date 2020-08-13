package com.sample.postgress.entity;

public class Kullanici {

	int kullanici_no;
	String kullanici_adi;
	String kullanici_sifre;
	int uyeliktip_no;


	public int getKullanici_no() {
		return kullanici_no;
	}
	public void setKullanici_no(int kullanici_no) {
		this.kullanici_no = kullanici_no;
	}

	public String getKullanici_adi() {
		return kullanici_adi;
	}
	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}


	public String getKullanici_sifre() {
		return kullanici_sifre;
	}
	public void setKullanici_sifre(String kullanici_sifre) {
		this.kullanici_sifre = kullanici_sifre;
	}


	public int getUyeliktip_no()
	{ return uyeliktip_no;
	}
	public void setUyeliktip_no(int uyeliktip_no) {
		this.uyeliktip_no = uyeliktip_no;
	}
	
}
