package com.sample.postgress.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sample.postgress.dao.KullaniciBilgiDao;
import com.sample.postgress.entity.KullaniciBilgileri;

import java.util.List;
@Component
public class BilgilerServisImpl implements BilgilerServis {
    @Resource
    KullaniciBilgiDao kullaniciBilgiDao;
    @Override
    public List<KullaniciBilgileri> findAll() {
        return kullaniciBilgiDao.findAll();
    }
    @Override
    public void kullanicibilgiKayit(KullaniciBilgileri bilg) {
        kullaniciBilgiDao.kullanicibilgiKayit(bilg);
}
    @Override
    public void ulkeDegistirme(KullaniciBilgileri bilg) {
        kullaniciBilgiDao.ulkeDegistirme(bilg);
    }
    @Override
    public void telefonDegistirme(KullaniciBilgileri bilg) {
        kullaniciBilgiDao.telefonDegistirme(bilg);
    }
    @Override
    public void sehirDegistirme(KullaniciBilgileri bilg) {
        kullaniciBilgiDao.sehirDegistirme(bilg);
    }
}
