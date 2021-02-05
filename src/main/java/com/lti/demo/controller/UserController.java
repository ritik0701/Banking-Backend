
package com.lti.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.UserRepository;
import com.lti.demo.service.UserService;
import com.lti.demo.service.UserServiceImpl;


@RestController
@Controller
public class UserController 
{
	@Autowired
	UserService userserv;
	@RequestMapping(path="/getUser")
	@ResponseBody
	public User getUser(long accNumber)
	{
		return userserv.getUserId(accNumber);
		//return "user present";
	}
	@RequestMapping(path="/loginUser")
	@ResponseBody
	public String loginUser(long userId,String pass)
	{
		userserv.loginUser(userId,pass);
		return "user login";
	}
	
	@RequestMapping(path="/resetPass")
	@ResponseBody
	public String resetPass(long userId,String newPass)
	{
		userserv.resetPassword(userId,newPass);
		return "pass changed";
	}
	
	@RequestMapping(path="/resetTransPass")
	@ResponseBody
	public String resetTransPass(long userId,int pass)
	{
		userserv.resetTransactionPassword(userId,pass);
		return "Transaction pass changed";
	}
	
}
