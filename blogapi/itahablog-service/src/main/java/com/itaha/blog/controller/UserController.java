package com.itaha.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itaha.blog.service.UserService;
import com.itaha.vo.User;

@RestController
public class UserController {
	@Autowired
	private UserService api;

	@GetMapping("/api/user/list")
	public List<User> userList() {
		return api.userList();
	}

	@GetMapping("/api/user/{id}")
	public User userById(@PathVariable("id") String id) {
		return api.userById(id);
	}

	@GetMapping("/api/user/insert")
	public String userInsert(@RequestBody User u) {
		return api.userInsert(u);
	}

	@GetMapping("/api/user/addget")
	public void userAdd(@RequestParam String nickname, @RequestParam String username) {
		User u = new User(nickname, username);
		api.userAdd(u);
	}

	@PostMapping("/api/user/update")
	public int userUpdate(@RequestBody User u) {
		return api.userUpdate(u);
	}

	@DeleteMapping("/api/user/delete/{id}")
	public int userDelete(@PathVariable("id") String id) {
		return api.userDelete(id);
	}
}
