package com.sample.postgress.dao;

import com.sample.postgress.entity.KullaniciBilgileri;

import java.util.List;

public interface KullaniciBilgiDao {

    List<KullaniciBilgileri> findAll();

    void kullanicibilgiKayit(KullaniciBilgileri kullaniciBilgileri);

    void ulkeDegistirme(KullaniciBilgileri kullaniciBilgileri);

    void telefonDegistirme(KullaniciBilgileri kullaniciBilgileri);

    void sehirDegistirme(KullaniciBilgileri kullaniciBilgileri);
//
//    public void kullaniciSilme(KullaniciBilgileri kullaniciBilgileri);
//
//    void kullanicibilgiarama(KullaniciBilgileri kullaniciBilgileri);
}
