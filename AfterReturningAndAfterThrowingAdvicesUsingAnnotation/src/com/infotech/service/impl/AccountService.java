package com.infotech.service.impl;

import com.infotech.model.Account;

public interface AccountService {

	public abstract Account getAccountByCustomerId(String customerId)
			throws Exception;

}