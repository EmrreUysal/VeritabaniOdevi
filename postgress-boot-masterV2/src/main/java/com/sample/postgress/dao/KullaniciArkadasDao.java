package com.sample.postgress.dao;

import java.util.List;

import com.sample.postgress.entity.KullaniciArkadas;

public interface KullaniciArkadasDao {

    List<KullaniciArkadas> findAll();

    void kullaniciArkadasEkleme(KullaniciArkadas kullaniciArkadas);

    void kullaniciArkadasSilme(KullaniciArkadas kullaniciArkadas);

    List<KullaniciArkadas> findArkadaslar(int kullaniciNo);

}
