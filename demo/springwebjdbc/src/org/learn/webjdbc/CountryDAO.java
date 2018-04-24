package org.learn.webjdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CountryDAO{
	private JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}

	public int getCountryCount(){
		return template.queryForObject("SELECT COUNT(*) from countries2",
				Integer.class);
	}

	public Country getCountry(String ctryId){
		String sql = "SELECT * FROM countries2 WHERE COUNTRYID = ?";
		return template.queryForObject(sql,new CountryMapper(), ctryId);
	}
	
	public List<Country> getCountries(){
		String sql = "SELECT * FROM countries2";
		return template.query(sql,new CountryMapper());
	}
	
	public void deleteCountry(String ctryId){
		String sql = "DELETE FROM countries2 WHERE COUNTRYID = ?";
		template.update(sql, ctryId);
		

	}

	public void insertCountry(Country ctry){
		String sql = "INSERT INTO countries2 VALUES(?,?,?)";
		template.update(sql, ctry.getCountryId(), ctry.getCountryName(),
				ctry.getRegionId());
	
	}
	
	private static class CountryMapper implements RowMapper<Country>{
		public Country mapRow(ResultSet rslt, int arg1) throws SQLException {
			Country ctry = new Country();
			ctry.setCountryId(rslt.getString(1));
			ctry.setCountryName(rslt.getString(2)); 
			ctry.setRegionId(rslt.getInt(3));
			return ctry;
		}

	}
}
