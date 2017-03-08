package com.infotech.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.infotech.model.Account;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	private static Map<String,Account> map = null;
	
	static{
		map = new HashMap<>();
		map.put("C67669800", new Account("78278287000", "Saving Account"));
		map.put("C67669811", new Account("78278287111", "Current Account"));
	}
	

	/* (non-Javadoc)
	 * @see com.infotech.service.impl.AccountService#getAccountByCustomerId(java.lang.String)
	 */
	@Override
	public Account getAccountByCustomerId(String customerId) throws Exception{
		if(customerId ==null){
			throw new Exception("Customer Id is invlaid");
		}
		Account account= null;
		Set<Entry<String, Account>> entrySet = map.entrySet();
		for (Entry<String, Account> entry : entrySet) {
			if(entry.getKey().equals(customerId)){
				account= entry.getValue();
			}
		}
		return account;
	}
}
