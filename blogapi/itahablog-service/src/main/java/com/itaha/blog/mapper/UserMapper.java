package com.itaha.blog.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itaha.vo.User;

public interface UserMapper extends BaseMapper<User> {
	User userById(String id);

	@Select("select * from user where username=#{username} and password=#{password}")
	User userLogin(@Param("username") String username, @Param("password") String password);
}
