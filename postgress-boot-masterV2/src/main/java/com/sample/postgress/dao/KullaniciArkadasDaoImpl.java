package com.sample.postgress.dao;

import com.sample.postgress.entity.KullaniciArkadas;
import com.sample.postgress.mapper.KullaniciArkadasRowMapper;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class KullaniciArkadasDaoImpl implements KullaniciArkadasDao {
    public KullaniciArkadasDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<KullaniciArkadas> findAll() {
        return template.query("select * from mentalaritmetik.kullanici_arkadaslar", new KullaniciArkadasRowMapper());
    }
    @Override
    public List<KullaniciArkadas> findArkadaslar(int kullaniciNo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kullanici_no", kullaniciNo);
        return template.query("select * from mentalaritmetik.kullanici_arkadaslar WHERE kullanici_no = :kullanici_no",map ,new KullaniciArkadasRowMapper());
    }

    @Override
    public void kullaniciArkadasEkleme(KullaniciArkadas kullaniciArkadas) {
        final String sql = "insert into mentalaritmetik.kullanici_arkadaslar(kullanici_no , arkadas_no) values(:kullanici_no,:arkadas_no)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciArkadas.getKullanici_no())
                .addValue("arkadas_no", kullaniciArkadas.getArkadas_no());
        template.update(sql, param, holder);

        SqlParameterSource param2 = new MapSqlParameterSource()
                .addValue("kullanici_no", kullaniciArkadas.getArkadas_no())
                .addValue("arkadas_no", kullaniciArkadas.getKullanici_no());
        template.update(sql, param2, holder);
    }

    @Override
    public void kullaniciArkadasSilme(KullaniciArkadas kullaniciArkadas) {
        final String sql = "delete from mentalaritmetik.kullanici_arkadaslar  where kullanici_no=:kullanici_no AND arkadas_no=:arkadas_no";


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("kullanici_no", kullaniciArkadas.getKullanici_no());
        map.put("arkadas_no", kullaniciArkadas.getArkadas_no());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("kullanici_no", kullaniciArkadas.getArkadas_no());
        map2.put("arkadas_no", kullaniciArkadas.getKullanici_no());

        template.execute(sql, map2, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });



    }
}
