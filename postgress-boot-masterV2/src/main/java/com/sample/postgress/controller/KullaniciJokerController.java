package com.sample.postgress.controller;


import com.sample.postgress.entity.KullaniciJokerHakki;
import com.sample.postgress.service.KullaniciJokerServis;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/postgressApp")
public class KullaniciJokerController {
    @Resource
    KullaniciJokerServis kullaniciJokerServis;
    @PutMapping(value="/jokerHakkiDegisimi")
    public void jokerdegisikligi(@RequestBody KullaniciJokerHakki joker){
        kullaniciJokerServis.jokerKullanildi(joker);
    }
}
