package com.itaha.blog.service;

import java.util.List;

import com.itaha.vo.Articles;

public interface ArticlesService {
	/**
	 * 查询所有文章
	 * 
	 * @return
	 */
	List<Articles> articlesList();

	/**
	 * 根据主键id查询文章
	 * 
	 * @return
	 */
	Articles articlesById(String id);

	/**
	 * 插入文章，返回主键id
	 * 
	 * @return
	 */
	String articlesInsert(Articles art);

	/**
	 * 更新文章，返回更新条数
	 * 
	 * @return
	 */
	int articlesUpdate(Articles art);

	/**
	 * 添加文章
	 * 
	 * @return
	 */
	void articlesAdd(Articles art);

	/**
	 * 删除文章，返回删除的条数
	 * 
	 * @return
	 */
	int articlesDelete(String id);
}
