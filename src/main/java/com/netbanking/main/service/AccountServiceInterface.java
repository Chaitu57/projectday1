package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.Account;

public interface AccountServiceInterface {
	public boolean addNewAccount(Account account);
	
	public boolean updateAccount(Account account);

	public boolean deleteAccountByAccountId(int accountId);

	public Account getAccountByAccountId(int accountId);

	public List<Account> getAllAccount();
}
