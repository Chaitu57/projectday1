package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.BankSlip;



public interface BankSlipServiceInterface {

	
	public boolean addNewBankSlip(BankSlip bankSlip);

	public boolean updateBankSlip( BankSlip bankSlip);

	public boolean deleteBankSlipByAccountId(int accountId);

	public BankSlip getBankSlipByAccountId(int accountId);

	public List<BankSlip>getAllBankSlip();

}

