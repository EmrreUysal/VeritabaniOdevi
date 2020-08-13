package com.sample.postgress.service;

import com.sample.postgress.dao.KullaniciArkadasDao;
import com.sample.postgress.entity.KullaniciArkadas;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class KullaniciArkServisImpl implements KullaniciArkServis {
    @Resource
    KullaniciArkadasDao kullaniciArkadasDao;
    @Override
    public List<KullaniciArkadas> findAll(){return kullaniciArkadasDao.findAll();}

    @Override
    public void kullaniciArkadasEkleme(KullaniciArkadas ark){
        kullaniciArkadasDao.kullaniciArkadasEkleme(ark);
    }

    @Override
    public void kullaniciArkadasSilme(KullaniciArkadas ark){
        kullaniciArkadasDao.kullaniciArkadasSilme(ark);
    }
    @Override
    public List<KullaniciArkadas> findArkadaslar(int kullaniciNo){
        return kullaniciArkadasDao.findArkadaslar(kullaniciNo);
    }
}
