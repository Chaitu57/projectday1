package com.netbanking.main.pojo;

import java.time.LocalDate;

public class Transaction {
	
	private int transactionID;
	private LocalDate transactionDate;
	private String transactionType;
	private int fromAccountID;
	private int toAccountID;
	private double transactionAmount;
	private String transactionStatus;
	private Account account;
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}


	public Transaction(int transactionID, LocalDate transactionDate, String transactionType, int fromAccountID,
			int toAccountID, double transactionAmount, Account account) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.fromAccountID = fromAccountID;
		this.toAccountID = toAccountID;
		this.transactionAmount = transactionAmount;
		this.account = account;
	}


	public int getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public int getFromAccountID() {
		return fromAccountID;
	}


	public void setFromAccountID(int fromAccountID) {
		this.fromAccountID = fromAccountID;
	}


	public int getToAccountID() {
		return toAccountID;
	}


	public void setToAccountID(int toAccountID) {
		this.toAccountID = toAccountID;
	}


	public double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", fromAccountID=" + fromAccountID + ", toAccountID="
				+ toAccountID + ", transactionAmount=" + transactionAmount + ", account=" + account + "]";
	}
	
	
	


}
