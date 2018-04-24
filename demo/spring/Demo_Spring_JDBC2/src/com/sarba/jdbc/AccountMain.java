package com.sarba.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain {
public static void main(String[] args) {
	ApplicationContext context=
new ClassPathXmlApplicationContext("jdbc.xml");
	
	AccountDao dao=
(AccountDao)context.getBean("accountDao");
	
	Account account=new Account();
	account.setAccId("101");
	account.setBalance(3000.00);
	
	int result=dao.createNewAccount(account);
	if(result>0)
		System.out.println("created");
	else
		System.out.println(" not created");
		
}
}
