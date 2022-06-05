package com.netbanking.main.pojo;

import java.time.LocalDate;

public class BankSlip {
	
	private int bankSlipID;
	private LocalDate chequeDate;
	private LocalDate slipDate;
	private int payersAccountNumber;
	private String payerBank;
	private double bankSlipAmount;
	private String chequeStatus;
	private Account account;
	private ChequeDetails chequeDetails;
	
	public BankSlip() {
		// TODO Auto-generated constructor stub
	}

	public BankSlip(int bankSlipID, LocalDate chequeDate, LocalDate slipDate, int payersAccountNumber, String payerBank,
			double bankSlipAmount, String chequeStatus, Account account, ChequeDetails chequeDetails) {
		super();
		this.bankSlipID = bankSlipID;
		this.chequeDate = chequeDate;
		this.slipDate = slipDate;
		this.payersAccountNumber = payersAccountNumber;
		this.payerBank = payerBank;
		this.bankSlipAmount = bankSlipAmount;
		this.chequeStatus = chequeStatus;
		this.account = account;
		this.chequeDetails = chequeDetails;
	}

	public int getBankSlipID() {
		return bankSlipID;
	}

	public void setBankSlipID(int bankSlipID) {
		this.bankSlipID = bankSlipID;
	}

	public LocalDate getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(LocalDate chequeDate) {
		this.chequeDate = chequeDate;
	}

	public LocalDate getSlipDate() {
		return slipDate;
	}

	public void setSlipDate(LocalDate slipDate) {
		this.slipDate = slipDate;
	}

	public int getPayersAccountNumber() {
		return payersAccountNumber;
	}

	public void setPayersAccountNumber(int payersAccountNumber) {
		this.payersAccountNumber = payersAccountNumber;
	}

	public String getPayerBank() {
		return payerBank;
	}

	public void setPayerBank(String payerBank) {
		this.payerBank = payerBank;
	}

	public double getBankSlipAmount() {
		return bankSlipAmount;
	}

	public void setBankSlipAmount(double bankSlipAmount) {
		this.bankSlipAmount = bankSlipAmount;
	}

	public String getChequeStatus() {
		return chequeStatus;
	}

	public void setChequeStatus(String chequeStatus) {
		this.chequeStatus = chequeStatus;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ChequeDetails getChequeDetails() {
		return chequeDetails;
	}

	public void setChequeDetails(ChequeDetails chequeDetails) {
		this.chequeDetails = chequeDetails;
	}

	@Override
	public String toString() {
		return "BankSlip [bankSlipID=" + bankSlipID + ", chequeDate=" + chequeDate + ", slipDate=" + slipDate
				+ ", payersAccountNumber=" + payersAccountNumber + ", payerBank=" + payerBank + ", bankSlipAmount="
				+ bankSlipAmount + ", chequeStatus=" + chequeStatus + ", account=" + account + ", chequeDetails="
				+ chequeDetails + "]";
	}
	
	
	
	
	

}
