package com.sample.postgress.mapper;

import com.sample.postgress.entity.KullaniciJokerHakki;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class KullaniciJokerRowMapper implements RowMapper<KullaniciJokerHakki> {

    @Override
    public KullaniciJokerHakki mapRow(ResultSet rs,int arg1) throws SQLException{
        KullaniciJokerHakki kullaniciJokerHakki = new KullaniciJokerHakki();
        kullaniciJokerHakki.setKullanici_no(rs.getInt("kullanici_no"));
        kullaniciJokerHakki.setJoker_hakki(rs.getInt("joker_hakki"));
        return kullaniciJokerHakki;
    }
}
