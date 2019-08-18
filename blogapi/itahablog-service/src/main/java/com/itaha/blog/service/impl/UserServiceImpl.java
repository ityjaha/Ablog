package com.itaha.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.itaha.blog.mapper.UserMapper;
import com.itaha.blog.service.UserService;
import com.itaha.vo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;

	@Override
	public List<User> userList() {
		QueryWrapper<User> wrapper = new QueryWrapper<>();
		return mapper.selectList(wrapper);
	}

	@Override
	public User userById(String id) {
		return mapper.userById(id);
	}

	@Override
	public String userInsert(User u) {
		return mapper.userInsert(u);
	}

	@Override
	public void userAdd(User u) {
		mapper.insert(u);
	}

	@Override
	public int userUpdate(User u) {
		UpdateWrapper<User> wrapper = new UpdateWrapper<>();
		return mapper.update(u, wrapper);
	}

	@Override
	public int userDelete(String id) {
		return mapper.deleteById(id);
	}

}
