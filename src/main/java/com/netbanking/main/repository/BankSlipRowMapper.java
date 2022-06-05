package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.ChequeDetails;



public class BankSlipRowMapper {

	public BankSlip mapRow(ResultSet resultSet, int i) throws SQLException {
		int bankSlipId = resultSet.getInt("bankSlipId");
		Date chequeDate = resultSet.getDate("chequeDate");
	     Date slipDate=resultSet.getDate("slipdate");
	     int payersAccountNumber=resultSet.getInt("payersAccountNumber");
	     String payerBank=resultSet.getString("payersbank");
	     double bankSlipAmount=resultSet.getDouble("");
	     String chequeStatus=resultSet.getString("");
	     Account account =resultSet.getObject(account);
	     ChequeDetails chequeDetails= resultSet.getObject(chequeDetails);

		BankSlip bankSlip2 = new BankSlip(bankSlipId,chequeDate, slipDate, payersAccountNumber, payerBank, bankSlipAmount, chequeStatus, account,chequeDetails);
		return bankSlip2;
	}
	
}
