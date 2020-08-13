package com.sample.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.postgress.entity.Kullanici;

public class KullaniciRowMapper implements RowMapper<Kullanici> {

	@Override
	public Kullanici mapRow(ResultSet rs, int arg1) throws SQLException {
		Kullanici kullanici = new Kullanici();
		kullanici.setKullanici_no(rs.getInt("kullanici_no"));
		kullanici.setKullanici_adi(rs.getString("kullanici_adi"));
		kullanici.setKullanici_sifre(rs.getString("kullanici_sifre"));
		kullanici.setUyeliktip_no(rs.getInt("uyeliktip_no"));
 
        return kullanici;
	}


}
