package com.sample.postgress.service;

import com.sample.postgress.entity.KullaniciArkadas;

import java.util.List;

public interface KullaniciArkServis {

    List<KullaniciArkadas> findAll();

    void kullaniciArkadasEkleme(KullaniciArkadas kullaniciArkadas);

    void kullaniciArkadasSilme(KullaniciArkadas kullaniciArkadas);

    List<KullaniciArkadas> findArkadaslar(int kullaniciNo);

}
