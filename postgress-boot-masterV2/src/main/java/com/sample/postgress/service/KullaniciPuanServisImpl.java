package com.sample.postgress.service;


import org.springframework.stereotype.Component;
import javax.annotation.Resource;

import java.util.List;

import com.sample.postgress.dao.KullaniciPuanDao;
import com.sample.postgress.entity.KullaniciPuan;
@Component
public class KullaniciPuanServisImpl implements KullaniciPuanServis {
    @Resource
    KullaniciPuanDao kullaniciPuanDao;
    @Override
    public List<KullaniciPuan> findAll() {
        return kullaniciPuanDao.findAll();
    }

    @Override
    public void kullaniciPuanDegistirme(KullaniciPuan puan) {
        kullaniciPuanDao.kullaniciPuanDegistirme(puan);

    }
}
