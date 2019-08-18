package com.itaha.vo;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户
 * 
 * @author itaha
 *
 */
@TableName(value = "user")
public class User {
	@TableId(type = IdType.UUID)
	private String id;
	@TableField
	private String nickname;
	@TableField
	private String username;
	@TableField
	private String password;
	@TableField
	private Date birthday;
	@TableField
	private String otel;
	@TableField
	private String mobile;
	@TableField
	private String email;
	@TableField
	private String address;
	@TableField
	private String remark;
	@TableField
	private Date predate;
	@TableField
	private String vprepare;
	@TableField
	private Date modifydate;
	@TableField
	private String modifier;
	@TableField(exist = false)
	private List<Comments> commentsList; // 作者有哪些评论
	@TableField(exist = false)
	private List<Articles> articlesList;// 作者有哪些文章
	@TableField(exist = false)
	private List<Browsed> browsedList;// 作者的浏览记录

	public User() {
	}

	public User(String nickname, String username) {
		this.nickname = nickname;
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getOtel() {
		return otel;
	}

	public void setOtel(String otel) {
		this.otel = otel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}

	public List<Articles> getArticlesList() {
		return articlesList;
	}

	public void setArticlesList(List<Articles> articlesList) {
		this.articlesList = articlesList;
	}

	public List<Browsed> getBrowsedList() {
		return browsedList;
	}

	public void setBrowsedList(List<Browsed> browsedList) {
		this.browsedList = browsedList;
	}

}
