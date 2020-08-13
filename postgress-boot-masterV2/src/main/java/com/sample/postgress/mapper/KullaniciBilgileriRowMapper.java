package com.sample.postgress.mapper;

import com.sample.postgress.entity.KullaniciBilgileri;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KullaniciBilgileriRowMapper implements RowMapper<KullaniciBilgileri>
{
    @Override
    public KullaniciBilgileri mapRow(ResultSet rs, int arg1) throws SQLException {
        KullaniciBilgileri kullanicibilgileri = new KullaniciBilgileri();
        kullanicibilgileri.setKullanici_no(rs.getInt("kullanici_no"));
        kullanicibilgileri.setSehir_no(rs.getInt("sehir_no"));
        kullanicibilgileri.setTelefon(rs.getInt("telefon"));
        kullanicibilgileri.setUlke(rs.getString("ulke"));

        return kullanicibilgileri;
    }
}
