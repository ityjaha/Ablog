package com.itaha.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itaha.blog.service.LoginService;
import com.itaha.vo.User;

@RestController
public class LoginController {
	@Autowired
	private LoginService login;

	@PostMapping(value = "/api/login")
	public User userLogin(@RequestBody User u) {
		return login.userLogin(u);
	}
}
