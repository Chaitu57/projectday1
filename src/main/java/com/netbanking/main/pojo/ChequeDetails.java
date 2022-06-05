package com.netbanking.main.pojo;

import java.time.LocalDate;

public class ChequeDetails {
	
	private String chequeNumber;
	private String toPay;
	private double chequeAmount;
	private LocalDate chequeDate;
	
	public ChequeDetails() {
		// TODO Auto-generated constructor stub
	}

	public ChequeDetails(String chequeNumber, String toPay, double chequeAmount, LocalDate chequeDate) {
		super();
		this.chequeNumber = chequeNumber;
		this.toPay = toPay;
		this.chequeAmount = chequeAmount;
		this.chequeDate = chequeDate;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getToPay() {
		return toPay;
	}

	public void setToPay(String toPay) {
		this.toPay = toPay;
	}

	public double getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(double chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public LocalDate getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(LocalDate chequeDate) {
		this.chequeDate = chequeDate;
	}

	@Override
	public String toString() {
		return "ChequeDetails [chequeNumber=" + chequeNumber + ", toPay=" + toPay + ", chequeAmount=" + chequeAmount
				+ ", chequeDate=" + chequeDate + "]";
	}
	
	
	

}
