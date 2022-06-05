package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.BankSlip;

@Repository
public class BankSlipRepository implements BankSlipRepositoryInterface {

	private int resultset;

	@Autowired
	JdbcTemplate jdbcTemplate;
	private static final String ADD_NEW_BANK_SLIP = "INSERT INTO BANK_SLIP(bankSlipID,chequeDate,slipDate,payersAccountNumber, payerBank,bankSlipAmount,chequeStatus,chequeDetails,account) values(?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE_BANK_SLIP = "UPDATE BANK_SLIP SET  bankSlipID=?,chequeDate=?,slipDate=?,payersAccountNumber=?, payerBank=?,bankSlipAmount=?,chequeStatus=?,chequeDetails=? WHERE account=? ";
	private static final String DELETE_BANK_SLIP = "DELETE BANK_SLIP WHERE ACCOUNT_ID=?";
	private static final String GET_ALL_BANK_SLIP = "SELECT * FROM BANK_SLIP";
	private static final String GET_ONE_BANK_SLIP = "SELECT * FROM BANK_SLIP WHERE ACCOUNT_ID=?";

	@Override
	public boolean addNewBankSlip(BankSlip bankSlip) {

		Object[] args = { bankSlip.getBankSlipID(), bankSlip.getChequeDate(), bankSlip.getSlipDate(),
				bankSlip.getPayersAccountNumber(), bankSlip.getPayerBank(), bankSlip.getBankSlipAmount(),
				bankSlip.getChequeStatus(), bankSlip.getAccount() };

		resultset = jdbcTemplate.update(ADD_NEW_BANK_SLIP, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateBankSlip(BankSlip bankSlip) {
		Object[] args = { bankSlip.getBankSlipID(), bankSlip.getChequeDate(), bankSlip.getSlipDate(),
				bankSlip.getPayersAccountNumber(), bankSlip.getPayerBank(), bankSlip.getBankSlipAmount(),
				bankSlip.getChequeStatus(), bankSlip.getAccount() };

		resultset = jdbcTemplate.update(UPDATE_BANK_SLIP, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteBankSlipByAccountId(int accountId) {
		Object[] args = { accountId };

		resultset = jdbcTemplate.update(DELETE_BANK_SLIP, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<BankSlip> getAllBankSlip() {

		List<BankSlip> allBankSlip=jdbcTemplate.query(GET_ALL_BANK_SLIP, new CustomerRowMapper());
		return allBankSlip;

	}

	@Override
	public BankSlip getBankSlipByAccountId(int accountId) {
		Object[] args = { accountId };
		BankSlip bankSlip = jdbcTemplate.queryForObject(GET_ONE_BANK_SLIP, new CustomerRowMapper(), args);
		return bankSlip;

	}
}
