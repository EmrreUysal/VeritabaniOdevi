package com.sample.postgress.service;

import com.sample.postgress.dao.KullaniciJokerDao;
import com.sample.postgress.entity.KullaniciJokerHakki;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class KullaniciJokerServisImpl implements KullaniciJokerServis{
    @Resource
    KullaniciJokerDao kullaniciJokerDao;
    @Override
    public void jokerKullanildi(KullaniciJokerHakki joker){
        kullaniciJokerDao.jokerKullanildi(joker);
    }
}
