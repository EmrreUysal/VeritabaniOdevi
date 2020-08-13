package com.sample.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sample.postgress.entity.KullaniciArkadas;
import org.springframework.jdbc.core.RowMapper;


public class KullaniciArkadasRowMapper implements RowMapper<KullaniciArkadas> {

    @Override
    public KullaniciArkadas mapRow(ResultSet rs, int arg1) throws SQLException {
        KullaniciArkadas kullaniciarkadas = new KullaniciArkadas();
        kullaniciarkadas.setKullanici_no(rs.getInt("kullanici_no"));
        kullaniciarkadas.setArkadas_no(rs.getInt("arkadas_no"));

        return kullaniciarkadas;
    }
}
