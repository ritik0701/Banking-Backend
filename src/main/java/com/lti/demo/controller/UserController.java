package com.lti.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.lti.demo.dto.GetUserIdDto;
import com.lti.demo.dto.LoginUserDto;
import com.lti.demo.dto.ResetPasswordDto;
import com.lti.demo.dto.ResetTransPasswordDto;
import com.lti.demo.dto.StatusDto;
import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.UserRepository;
import com.lti.demo.service.UserService;
import com.lti.demo.service.UserServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController 
{
	@Autowired
	UserService userserv;
	
	@RequestMapping(path="/getUser")
	@ResponseBody
	public String getUser(GetUserIdDto getuser)
	{
		userserv.getUserId(getuser.getAccNumber());
		return "user present";
	}
	
	@RequestMapping(path="/loginUser")
	@ResponseBody
	public StatusDto loginUser(@RequestBody LoginUserDto loginuser)
	{
		StatusDto status=new StatusDto();
		if((userserv.loginUser(loginuser.getUserId(), loginuser.getPass()))==false)
		{
			
			 status.setStatus("Invalid credentials!!");
			
		}
		else
		{
			status.setStatus("Login Successful!!");
		}
		return status;
		
	}
	
	@RequestMapping(path="/resetPass")
	@ResponseBody
	public StatusDto resetPass(@RequestBody ResetPasswordDto resetpass)
	{
		StatusDto status=new StatusDto();
		if((userserv.resetPassword(resetpass.getUserId(),resetpass.getUpdatedPassword()))==true)
		{
			status.setStatus("User Password Changed!!");
		}
		else
		{
			status.setStatus("User doesnt exist!!");	
			
		}
		return status;
	}

	@RequestMapping(path="/resetTransPass")
	@ResponseBody
	public  StatusDto resetTransPass(@RequestBody ResetTransPasswordDto resettranspass)
	{
		StatusDto status=new StatusDto();
		
		if((userserv.resetTransactionPassword(resettranspass.getUserId(),resettranspass.getUpdatedPassword()))==true)
		{
			status.setStatus("Transaction Password Changed!!");
		}
		else
		{
			status.setStatus("User doesnt exist!!");	
			
		}
		return status;
		
	}
	
}