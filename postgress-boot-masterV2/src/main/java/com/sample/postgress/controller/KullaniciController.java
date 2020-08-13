package com.sample.postgress.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Kullanici;
import com.sample.postgress.service.KullaniciServis;

@RestController
@RequestMapping("/postgressApp")
public class KullaniciController {

	@Resource
	KullaniciServis kullaniciServis;
	
	@GetMapping(value = "/kullaniciListesi")
	public List<Kullanici> getTable() {
		return kullaniciServis.findAll();
	
	}
	
	@PostMapping(value = "/kullaniciOlustur")
	public void createtable(@RequestBody Kullanici emp) {
		 kullaniciServis.kullaniciKayit(emp);
	
	}
	@PutMapping(value = "/kullaniciSifreDegistirme")
	public void updatetable(@RequestBody Kullanici emp) {
		 kullaniciServis.sifreDegistirme(emp);
	
	}
//	@PutMapping(value = "/executeUpdateKullanici")
//	public void executeUpdatetable(@RequestBody Kullanici emp) {
//		 mentalServis.executeUpdatetable(emp);
//
//	}
	
	@DeleteMapping(value = "/deleteKullanici")
	public void deletetable(@RequestBody Kullanici emp) {
		 kullaniciServis.kullaniciSilme(emp);
	
	}


	
}
