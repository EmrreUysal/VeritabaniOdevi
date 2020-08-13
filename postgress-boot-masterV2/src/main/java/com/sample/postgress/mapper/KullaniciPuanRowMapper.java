package com.sample.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.sample.postgress.entity.KullaniciPuan;


public class KullaniciPuanRowMapper implements RowMapper<KullaniciPuan> {

    @Override
    public KullaniciPuan mapRow(ResultSet rs,int arg1) throws SQLException{
        KullaniciPuan kullanicipuan = new KullaniciPuan();
        kullanicipuan.setKullanici_no(rs.getInt("kullanici_no"));
        kullanicipuan.setKullanici_puan(rs.getInt("kullanici_puan"));
        return kullanicipuan;
    }
}
