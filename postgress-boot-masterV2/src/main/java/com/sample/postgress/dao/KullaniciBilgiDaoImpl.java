package com.sample.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.KullaniciBilgileri;
import com.sample.postgress.mapper.KullaniciBilgileriRowMapper;
@Repository
public class KullaniciBilgiDaoImpl implements KullaniciBilgiDao {

    public KullaniciBilgiDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<KullaniciBilgileri> findAll() {
        return template.query("select * from mentalaritmetik.kullanici_bilgileri", new KullaniciBilgileriRowMapper());
    }

    @Override
    public void kullanicibilgiKayit(KullaniciBilgileri kullaniciBilgileri) {
        final String sql = "insert into mentalaritmetik.kullanici_bilgileri (kullanici_no , sehir_no , telefon , ulke) values(:kullanici_no,:sehir_no,:telefon, :ulke)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciBilgileri.getKullanici_no())
                .addValue("sehir_no", kullaniciBilgileri.getSehir_no())
                .addValue("telefon", kullaniciBilgileri.getTelefon())
                .addValue("ulke",kullaniciBilgileri.getUlke());
        template.update(sql,param, holder);
    }

    @Override
    public void ulkeDegistirme(KullaniciBilgileri kullaniciBilgileri) {
        final String sql = "update mentalaritmetik.kullanici_bilgileri set ulke=:ulke where kullanici_no=:kullanici_no";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciBilgileri.getKullanici_no())
                .addValue("ulke", kullaniciBilgileri.getUlke());
        template.update(sql,param, holder);

    }

    public void sehirDegistirme(KullaniciBilgileri kullaniciBilgileri) {
        final String sql = "update mentalaritmetik.kullanici_bilgileri set sehir_no=:sehir_no where kullanici_no=:kullanici_no";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciBilgileri.getKullanici_no())
                .addValue("sehir_no", kullaniciBilgileri.getSehir_no());
        template.update(sql,param, holder);

    }

    public void telefonDegistirme(KullaniciBilgileri kullaniciBilgileri) {
        final String sql = "update mentalaritmetik.kullanici_bilgileri set telefon=:telefon where kullanici_no=:kullanici_no";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciBilgileri.getKullanici_no())
                .addValue("telefon", kullaniciBilgileri.getTelefon());
        template.update(sql,param, holder);

    }




}
