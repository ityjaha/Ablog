package com.itaha.blog.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itaha.vo.Articles;

public interface ArticlesMapper extends BaseMapper<Articles> {
	Articles articlesById(String id);

	List<Articles> articlesList();
}
