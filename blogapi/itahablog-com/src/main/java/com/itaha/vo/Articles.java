package com.itaha.vo;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 文章
 * 
 * @author itaha
 *
 */
@TableName(value = "articles")
public class Articles {
	@TableId(type = IdType.UUID)
	private String id;
	@TableField
	private String title;
	@TableField
	private String summary; // 摘要
	@TableField
	private String content; // 内容
	@TableField
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date predate;
	@TableField
	private String vprepare;
	@TableField
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date modifydate;
	@TableField
	private String modifier;
	@TableField
	private String remark;
	@TableField
	private String labels; // 文章标签
	@TableField
	private String url;// 文章链接
	@TableField
	private String draftype;// 是否草稿
	@TableField
	private String categories;// 文章分类
	@TableField(exist = false)
	private User user; // 作者一个，即当前录入人
	@TableField(exist = false)
	private List<Browsed> browsedList; // 浏览记录

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDraftype() {
		return draftype;
	}

	public void setDraftype(String draftype) {
		this.draftype = draftype;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public List<Browsed> getBrowsedList() {
		return browsedList;
	}

	public void setBrowsedList(List<Browsed> browsedList) {
		this.browsedList = browsedList;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

}
