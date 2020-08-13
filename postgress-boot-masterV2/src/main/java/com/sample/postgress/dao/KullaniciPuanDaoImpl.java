package com.sample.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.KullaniciPuan;
import com.sample.postgress.mapper.KullaniciPuanRowMapper;

import java.util.List;
@Repository
public class KullaniciPuanDaoImpl implements KullaniciPuanDao {

    public KullaniciPuanDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<KullaniciPuan> findAll() {
        return template.query("select * from mentalaritmetik.kullanici_puanlar", new KullaniciPuanRowMapper());
    }

    @Override
    public void kullaniciPuanDegistirme(KullaniciPuan kullaniciPuan) {
        final String sql = "update mentalaritmetik.kullanici_puanlar set kullanici_puan = kullanici_puan + :kullanici_puan where kullanici_no=:kullanici_no";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciPuan.getKullanici_no())
                .addValue("kullanici_puan", kullaniciPuan.getKullanici_puan());
        template.update(sql,param, holder);

    }
}
