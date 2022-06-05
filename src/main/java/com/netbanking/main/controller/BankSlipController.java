package com.netbanking.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.repository.BankSlipRepositoryInterface;
import com.netbanking.main.service.AccountService;
import com.netbanking.main.service.BankSlipService;
import com.netbanking.main.service.BankSlipServiceInterface;

@RestController
@CrossOrigin(origins="")
@RequestMapping("bankslip")
public class BankSlipController {
		
		@Autowired
		private BankSlipServiceInterface bankSlipService;

		@RequestMapping(value = "bankslip", method = RequestMethod.POST)
		public boolean addNewBankSlip(BankSlip bankSlip) {
			return bankSlipService.addNewBankSlip(bankSlip);
			}
	  

		@RequestMapping(value="",method = RequestMethod.PUT)
		public boolean updateBankSlip(BankSlip bankSlip) {
			return bankSlipService.updateBankSlip(bankSlip);
		} 
		
		@RequestMapping(value="",method = RequestMethod.DELETE)
		public boolean deleteBankSlipByAccountId(int accountId) {
			return bankSlipService.deleteBankSlipByAccountId(accountId);
		}
		
		@RequestMapping(value="",method = RequestMethod.GET)
		public BankSlip getBankSlipByAccountId(int accountId) {
			return bankSlipService.getBankSlipByAccountId(accountId);	
		}
		
		@RequestMapping(value="",method = RequestMethod.GET)
		public List<BankSlip> getallbankslip(){
			return bankSlipService.getAllBankSlip();
			
		}

}  




	
	
