package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Account;
import com.infotech.service.impl.AccountService;
import com.infotech.service.impl.AccountServiceImpl;

public class ClientTest {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		
		AccountService accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		
		Account account = accountService.getAccountByCustomerId("C67669811");
		if(account != null)
			System.out.println(account.getAccountNumber()+"\t"+account.getAccountDescrption());
		((AbstractApplicationContext) ctx).close();
	}

}
