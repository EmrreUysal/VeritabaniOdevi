package com.sample.postgress.controller;




import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import com.sample.postgress.entity.KullaniciArkadas;
import com.sample.postgress.service.KullaniciArkServis;

@RestController
@RequestMapping("/postgressApp")
public class KullaniciArkadasController {
    @Resource
    KullaniciArkServis kullaniciArkServis;

    @GetMapping(value = "/arkadaslistesi")
    public List<KullaniciArkadas> getTable() {
        return kullaniciArkServis.findAll();
    }

    @PostMapping(value = "/kullaniciArkadasEkleme")
    public void arkadasekle(@RequestBody KullaniciArkadas ark) {
        kullaniciArkServis.kullaniciArkadasEkleme(ark);

    }

    @DeleteMapping(value = "/kullaniciArkadasSilme")
    public void arkadassilme(@RequestBody KullaniciArkadas ark) {
        kullaniciArkServis.kullaniciArkadasSilme(ark);
    }
    @GetMapping(value = "/kullanicininArkadasListesi")
    public List<KullaniciArkadas> getArkadaslar(@RequestParam int kullanici_no) {
        return kullaniciArkServis.findArkadaslar(kullanici_no);
    }
}