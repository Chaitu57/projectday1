package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.repository.AccountRepositoryInterface;

public class AccountService implements AccountServiceInterface {
	
	@Autowired
	private AccountRepositoryInterface accountRpository;

	@Override
	public boolean addNewAccount(Account account) {
		return accountRpository.addNewAccount(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		return accountRpository.updateAccount(account);
	}

	@Override
	public boolean deleteAccountByAccountId(int accountId) {
		return accountRpository.deleteAccountByAccountId(accountId);
	}

	@Override
	public Account getAccountByAccountId(int accountId) {
		return accountRpository.getAccountByAccountId(accountId);
	}

	@Override
	public List<Account> getAllAccount() {
		return accountRpository.getAllAccount();
	}

}
