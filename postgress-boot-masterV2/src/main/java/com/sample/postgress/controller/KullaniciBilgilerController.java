package com.sample.postgress.controller;

import java.util.List;

import javax.annotation.Resource;

import com.sample.postgress.entity.KullaniciBilgileri;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.service.BilgilerServis;

@RestController
@RequestMapping("/postgressApp")
public class KullaniciBilgilerController {

    @Resource
    BilgilerServis bilgilerServis;

    @GetMapping(value = "/kullanicibilgileriListesi")
    public List<KullaniciBilgileri> getTable() {
        return bilgilerServis.findAll();

    }

    @PostMapping(value = "/kullanicibilgisiOlustur")
    public void createtable(@RequestBody KullaniciBilgileri bilg) {
        bilgilerServis.kullanicibilgiKayit(bilg);

    }

    @PutMapping(value = "/kullaniciUlkeDegistirme")
    public void ulkedegistirme(@RequestBody KullaniciBilgileri bilg)
    {     bilgilerServis.ulkeDegistirme(bilg);
   }

    @PutMapping(value = "/kullaniciSehirDegistirme")
    public void sehirdegistirme(@RequestBody KullaniciBilgileri bilg)
    {     bilgilerServis.sehirDegistirme(bilg);
    }

    @PutMapping(value = "/kullaniciTelefonDegistirme")
    public void telefondegistirme(@RequestBody KullaniciBilgileri bilg)
    {     bilgilerServis.telefonDegistirme(bilg);
    }
//    @DeleteMapping(value = "/deleteKullanici")
//    public void deletetable(@RequestBody KullaniciBilgileri emp) {
//        bilgilerServis.deletetable(emp);
//    }



}
