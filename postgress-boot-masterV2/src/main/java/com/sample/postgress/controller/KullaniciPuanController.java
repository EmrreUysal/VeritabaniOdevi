package com.sample.postgress.controller;


import com.sample.postgress.entity.KullaniciPuan;
import com.sample.postgress.service.KullaniciPuanServis;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/postgressApp")
public class KullaniciPuanController {

    @Resource
    KullaniciPuanServis kullaniciPuanServis;

    @GetMapping(value = "/kullaniciPuanlarListesi")
    public List<KullaniciPuan> getTable() {
        return kullaniciPuanServis.findAll();
    }

//    @PostMapping(value = "/kullaniciPuanEkleme")
//    public void puanekle(@RequestBody KullaniciPuan puan){
//        kullaniciPuanServis.kullaniciPuanEkleme(puan);
//    }
    @PutMapping(value = "/kullaniciPuanDegistirme")
    public void puandegistir(@RequestBody KullaniciPuan puan){
        kullaniciPuanServis.kullaniciPuanDegistirme(puan);
    }
}
