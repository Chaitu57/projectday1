package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.pojo.Login;

public class CustomerRowMapper implements RowMapper<Customer>{

	public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
		int customerId = resultSet.getInt("customerId");
		String firstName = resultSet.getString("firstName");
		String lastName = resultSet.getString("lastName");
		String address = resultSet.getString("address");
		String city = resultSet.getString("city");
		String state = resultSet.getString("state");
		int zip = resultSet.getInt("zip");
		int phoneNumber = resultSet.getInt("phoneNumber");
		int telePhoneNumber = resultSet.getInt(" telePhoneNumber");
		String emailID = resultSet.getString("emailID");
		String status = resultSet.getString("status");
		Login login = (Login) resultSet.getObject("login");

		Customer customer = new Customer(customerId, firstName, lastName, address, city, state, zip, phoneNumber,
				telePhoneNumber, emailID, status, login);
		return customer;
	}
}
