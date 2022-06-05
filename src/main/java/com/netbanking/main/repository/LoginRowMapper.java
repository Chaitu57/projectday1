package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.netbanking.main.pojo.Login;

public class LoginRowMapper {

	public Login mapRow(ResultSet resultSet, int i) throws SQLException {
		String userId = resultSet.getString("USERID");
		String password = resultSet.getString("PASSWORD");
		String role = resultSet.getString("ROLE");

		Login login = new Login(userId, password, role);

		return login;

	}
}
