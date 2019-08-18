package com.itaha.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itaha.blog.mapper.UserMapper;
import com.itaha.blog.service.LoginService;
import com.itaha.vo.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper mapper;

	@Override
	public User userLogin(User u) {
		/**
		 * 这里密码要做加密处理
		 * 
		 */
		String username = u.getUsername();
		String password = u.getPassword();
		// TODO
		return mapper.userLogin(username, password);
	}

}
