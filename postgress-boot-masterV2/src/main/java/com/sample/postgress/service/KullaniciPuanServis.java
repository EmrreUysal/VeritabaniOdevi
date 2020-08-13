package com.sample.postgress.service;

import com.sample.postgress.entity.KullaniciPuan;

import java.util.List;

public interface KullaniciPuanServis {

    List<KullaniciPuan> findAll();

    void kullaniciPuanDegistirme(KullaniciPuan kullaniciPuan);
}
