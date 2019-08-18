package com.itaha.vo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 浏览记录表
 * 
 * @author itaha
 *
 */
@TableName(value = "browsed")
public class Browsed {
	@TableId(type = IdType.UUID)
	private String id;
	@TableField
	private Date predate;
	@TableField
	private String vprepare;
	@TableField
	private Date modifydate;
	@TableField
	private String modifier;
	@TableField
	private String remark;
	private User user; // 谁浏览过
	private Articles articles;// 浏览的是哪篇文章

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
