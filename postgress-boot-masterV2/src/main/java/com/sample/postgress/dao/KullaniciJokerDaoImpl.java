package com.sample.postgress.dao;

import com.sample.postgress.entity.KullaniciJokerHakki;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class KullaniciJokerDaoImpl implements KullaniciJokerDao {

    public KullaniciJokerDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public void jokerKullanildi(KullaniciJokerHakki kullaniciJokerHakki){
        final String sql = "update mentalaritmetik.kullanici_joker_hakki set joker_hakki=:joker_hakki where kullanici_no=:kullanici_no";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciJokerHakki.getKullanici_no())
                .addValue("joker_hakki", kullaniciJokerHakki.getJoker_hakki());
        template.update(sql,param, holder);

    }
}
