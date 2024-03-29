/*#
 #*/
package com.itaha.vo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 评论表
 * 
 * @author itaha
 *
 */
@TableName(value = "comments")
public class Comments {
	@TableId(type = IdType.UUID)
	private String id;
	@TableField
	private String content; // 评论内容
	@TableField
	private String cmtype; // 评论级次
	@TableField
	private Date predate;
	@TableField
	private String vprepare;
	@TableField
	private Date modifydate;
	@TableField
	private String modifier;

	private User user; // 谁的评论
	private Articles articles; // 评论了哪篇文章

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCmtype() {
		return cmtype;
	}

	public void setCmtype(String cmtype) {
		this.cmtype = cmtype;
	}

	public Date getPredate() {
		return predate;
	}

	public void setPredate(Date predate) {
		this.predate = predate;
	}

	public String getVprepare() {
		return vprepare;
	}

	public void setVprepare(String vprepare) {
		this.vprepare = vprepare;
	}

	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

}
