package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Kullanici;

public interface KullaniciServis {
	List<Kullanici> findAll();

	void kullaniciKayit(Kullanici emp);

	void sifreDegistirme(Kullanici emp);

	void kullaniciSilme(Kullanici emp);
	
}
