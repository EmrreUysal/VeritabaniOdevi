package com.sample.postgress.dao;

import java.util.List;

import com.sample.postgress.entity.Kullanici;

public interface KullaniciDao {

	List<Kullanici> findAll();

	void kullaniciKayit(Kullanici kullanici);

	void sifreDegistirme(Kullanici kullanici);

	public void kullaniciSilme(Kullanici kullanici);
}
