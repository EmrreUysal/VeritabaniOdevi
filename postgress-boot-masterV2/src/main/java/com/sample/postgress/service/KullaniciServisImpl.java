package com.sample.postgress.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sample.postgress.dao.KullaniciDao;
import com.sample.postgress.entity.Kullanici;
@Component
public class KullaniciServisImpl implements KullaniciServis {
	@Resource
	KullaniciDao kullaniciDao;
	@Override
	public List<Kullanici> findAll() {
		return kullaniciDao.findAll();
	}
	@Override
	public void kullaniciKayit(Kullanici emp) {
		kullaniciDao.kullaniciKayit(emp);
		
	}
	@Override
	public void sifreDegistirme(Kullanici emp) {
		kullaniciDao.sifreDegistirme(emp);
		
	}

	@Override
	public void kullaniciSilme(Kullanici emp) {
		kullaniciDao.kullaniciSilme(emp);
		
	}
}
