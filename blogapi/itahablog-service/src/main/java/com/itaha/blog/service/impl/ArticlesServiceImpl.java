package com.itaha.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.itaha.blog.mapper.ArticlesMapper;
import com.itaha.blog.service.ArticlesService;
import com.itaha.vo.Articles;

@Service
public class ArticlesServiceImpl implements ArticlesService {
	@Autowired
	private ArticlesMapper mapper;

	@Override
	public List<Articles> articlesList() {
		// QueryWrapper<Articles> wrapper = new QueryWrapper<>();
		return mapper.articlesList();
	}

	@Override
	public Articles articlesById(String id) {
		return mapper.articlesById(id);
	}

	@Override
	public String articlesInsert(Articles art) {
		mapper.insert(art);
		return art.getId();
	}

	@Override
	public void articlesAdd(Articles art) {
		mapper.insert(art);
	}

	@Override
	public int articlesUpdate(Articles art) {
		UpdateWrapper<Articles> wrapper = new UpdateWrapper<>();
		return mapper.update(art, wrapper);
	}

	@Override
	public int articlesDelete(String id) {
		return mapper.deleteById(id);
	}

}
