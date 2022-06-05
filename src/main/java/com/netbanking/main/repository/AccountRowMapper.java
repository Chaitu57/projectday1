package com.netbanking.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.Customer;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet resultSet, int i) throws SQLException {
		int accountID=resultSet.getInt("accountID");
		String accountType=resultSet.getString("accountType");
		Date openDate=resultSet.getDate("openDate");
		double minimumBalance=resultSet.getDouble("minimumBalance");
		double currentBalance=resultSet.getDouble("currentBalance");
		double rateOfInterest=resultSet.getDouble("rateOfInterest");
		Customer customer=(Customer) resultSet.getObject("customer");

		Account account= new Account(accountID, accountType, null, minimumBalance, currentBalance, rateOfInterest, customer);
		return account;
	}

}
