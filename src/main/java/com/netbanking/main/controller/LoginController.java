 package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.Login;
import com.netbanking.main.service.LoginServiceInterface;

@RestController
@CrossOrigin(origins="")
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginServiceInterface loginServiceInterface;
 
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public boolean addNewEmployee(Login login ) {
		return loginServiceInterface.addLogin(login);
	}

	@RequestMapping(value="",method = RequestMethod.PUT)
	public boolean updateLoginByUserId(Login login) {
		return loginServiceInterface.updateLoginByUserId(login);
	} 
	
	@RequestMapping(value="",method = RequestMethod.DELETE)
	public boolean deleteByUserId(String userId) {
		return loginServiceInterface.deleteByUserId(userId);
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public Login getOneUserByUserId(String userId) {
		return loginServiceInterface.getOneUserByUserId(userId);	
	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public List<Login> getAllLogin(){
		return loginServiceInterface.getAllLogin();
		
	}

	
	
	
}
