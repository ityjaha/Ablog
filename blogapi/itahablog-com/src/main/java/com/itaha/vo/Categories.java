package com.itaha.vo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 文章分类表
 * 
 * @author itaha
 *
 */
@TableName(value = "categories")
public class Categories {
	@TableId(type = IdType.UUID)
	private String id;
	@TableField
	private String name;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
