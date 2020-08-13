package com.sample.postgress.dao;

import com.sample.postgress.entity.KullaniciPuan;

import java.util.List;

public interface KullaniciPuanDao {

    List<KullaniciPuan> findAll();

    void kullaniciPuanDegistirme(KullaniciPuan kullaniciPuan);

}
