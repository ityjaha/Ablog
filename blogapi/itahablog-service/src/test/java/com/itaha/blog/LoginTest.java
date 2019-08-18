package com.itaha.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itaha.blog.service.LoginService;
import com.itaha.vo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LoginTest {
	@Autowired
	private LoginService login;

	@Test
	public void userLogin() {
		String username = "yj";
		String password = "itaha";
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		User user = login.userLogin(u);
		System.out.println(user);

	}
}
