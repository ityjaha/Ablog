package com.itaha.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itaha.blog.service.ArticlesService;
import com.itaha.vo.Articles;

@RestController
public class ArticlesController {
	@Autowired
	private ArticlesService api;

	@GetMapping("/api/articles/list")
	public List<Articles> articlesList() {
		return api.articlesList();
	}

	@GetMapping("/api/articles/{id}")
	public Articles articlesById(@PathVariable("id") String id) {
		return api.articlesById(id);
	}

	@GetMapping("/api/articles/insert")
	public String articlesInsert(@RequestBody Articles art) {
		return api.articlesInsert(art);
	}

	@PostMapping("/api/articles/update")
	public int articlesUpdate(@RequestBody Articles art) {
		return api.articlesUpdate(art);
	}

	@DeleteMapping("/api/articles/delete/{id}")
	public int articlesDelete(@PathVariable("id") String id) {
		return api.articlesDelete(id);
	}
}
