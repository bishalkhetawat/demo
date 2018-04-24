package com.sarba.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class AccountDao {
SimpleJdbcTemplate simpleJdbcTemplate;
	

	public SimpleJdbcTemplate getSimpleJdbcTemplate() {
		return simpleJdbcTemplate;
	}

	public void setSimpleJdbcTemplate(SimpleJdbcTemplate simpleJdbcTemplate) {
		this.simpleJdbcTemplate = simpleJdbcTemplate;
	}
	
	
	public int createNewAccount(Account account)
	{
	    String sql
="INSERT INTO account1 VALUES(?,?)";
	    
Object[] params=new Object[]
  {account.getAccId(),
   new Double(account.getBalance())
  };

return simpleJdbcTemplate.update(sql, params);

		
	}
	
}
