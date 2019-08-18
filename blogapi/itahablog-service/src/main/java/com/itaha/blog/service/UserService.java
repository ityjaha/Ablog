package com.itaha.blog.service;

import java.util.List;

import com.itaha.vo.User;

public interface UserService {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> userList();

	/**
	 * 根据主键id查询用户
	 * 
	 * @return
	 */
	User userById(String id);

	/**
	 * 插入用户，返回主键id
	 * 
	 * @return
	 */
	String userInsert(User u);

	/**
	 * 更新用户，返回更新条数
	 * 
	 * @return
	 */
	int userUpdate(User u);

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	void userAdd(User u);

	/**
	 * 删除用户，返回删除的条数
	 * 
	 * @return
	 */
	int userDelete(String id);
}
