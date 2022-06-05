package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.service.AccountServiceInterface;

@RestController
@CrossOrigin(origins="")
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	private AccountServiceInterface accountService;
	
	@RequestMapping(value="account", method = RequestMethod.POST)
	public boolean addNewAccount(Account account) {
		return accountService.addNewAccount(account);
	}
	
	@RequestMapping(value="account",method = RequestMethod.PUT)
	public boolean updateAccount(Account account) {
		return accountService.updateAccount(account);
	} 
	
	@RequestMapping(value="",method = RequestMethod.DELETE)
	public boolean deleteAccountByAccountId(int accountId) {
		return accountService.deleteAccountByAccountId(accountId);
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public Account getAccountByAccountId(int accountId) {
		return accountService.getAccountByAccountId(accountId);	
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public List<Account> getAllAccount(){
		return accountService.getAllAccount();
		
	}
}
