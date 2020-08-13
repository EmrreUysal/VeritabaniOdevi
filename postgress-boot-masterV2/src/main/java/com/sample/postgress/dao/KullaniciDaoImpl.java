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

import com.sample.postgress.entity.Kullanici;
import com.sample.postgress.mapper.KullaniciRowMapper;
@Repository
public class KullaniciDaoImpl implements KullaniciDao {
	
	public KullaniciDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;  
}  
	NamedParameterJdbcTemplate template;  

	@Override
	public List<Kullanici> findAll() {
		return template.query("select * from mentalaritmetik.kullanicilar", new KullaniciRowMapper());
	}
	@Override
	public void kullaniciKayit(Kullanici kullanici) {
		 final String sql = "insert into mentalaritmetik.kullanicilar (kullanici_adi , kullanici_sifre , uyeliktip_no)" +
				 " values(:kullanici_adi,mentalaritmetik.encrypt(:kullanici_sifre),:uyeliktip_no)";
		 
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
					.addValue("kullanici_adi", kullanici.getKullanici_adi())
					.addValue("kullanici_sifre", kullanici.getKullanici_sifre())
					.addValue("uyeliktip_no", kullanici.getUyeliktip_no());
	        template.update(sql,param, holder);
	 
	}
	
	@Override
	public void sifreDegistirme(Kullanici kullanici) {
		 final String sql = "update mentalaritmetik.kullanicilar set kullanici_sifre=:kullanici_sifre where kullanici_no=:kullanici_no";
		 
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
					.addValue("kullanici_no", kullanici.getKullanici_no())
					.addValue("kullanici_sifre", kullanici.getKullanici_sifre());
	        template.update(sql,param, holder);
	 
	}

	
	@Override
	public void kullaniciSilme(Kullanici kullanici) {
		 final String sql = "delete from mentalaritmetik.kullanicilar  where kullanici_no=:kullanici_no";
			 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("kullanici_no", kullanici.getKullanici_no());
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	 
	}
	
}
