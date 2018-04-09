/**
 * 
 */
package com.example.demo.controller;

import java.io.Console;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 * 
 * @FileName : LoginController.java
 * 
 * @Project : MySpringVue
 * 
 * @Date : 2018. 4. 9.
 * 
 * @Author : admin
 * 
 * @Program Description :
 * 
 */
//@RestController
@Controller
public class LoginController {

	@Autowired
	UserRepository userRepo;

	@RequestMapping("/login")
	public String getLogin() {
		 
		return "login";
	}
	
	@RequestMapping("/user-add-form")
	public String addNewUserForm() {
		return "addUserForm";
	}

	@RequestMapping("/user-add")
	@ResponseBody
//	public String addNewUser(@RequestParam String name, @RequestParam String id, @RequestParam String pwd,	@RequestParam String email) 
	public String addNewUser()
	{
		String name, id, pwd, email;
		try {
			java.util.Date date = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(date);
			
			User user = new User();
			user.setUserId("user1");
			user.setEmail("hello");
			user.setName("name");
			user.setPasswd("123123");
			user.setRegDT(currentTime);
			userRepo.save(user);
		} catch (Exception e) {
			// TODO: handle exception
			return "Failed";
		}
		
		

		return "Saved";
		
	}
}
