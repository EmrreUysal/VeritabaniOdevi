package com.sample.postgress.service;

import com.sample.postgress.entity.KullaniciBilgileri;

import java.util.List;

public interface BilgilerServis {

    List<KullaniciBilgileri> findAll();

    void kullanicibilgiKayit(KullaniciBilgileri kullaniciBilgileri);

    void ulkeDegistirme(KullaniciBilgileri kullaniciBilgileri);

    void telefonDegistirme(KullaniciBilgileri kullaniciBilgileri);

    void sehirDegistirme(KullaniciBilgileri kullaniciBilgileri);
}
