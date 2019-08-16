/*#
 #*/
package com.itaha.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 标题：评论表
 * </p>
 * <p>
 * 功能：
 * </p>
 * 
 * <pre>
 * 其他说明：
 * </pre>
 * <p>
 * 创建日期：2019年8月16日下午3:16:36
 * </p>
 * <p>
 * 类全名：com.itaha.vo.Comments
 * </p>
 * 查看帮助：<a href="" target="_blank"></a>
 *
 * 作者：yinjun 初审： 复审：
 * 
 * @version 1.0
 */
@TableName(value = "comments")
public class Comments {
	@TableId(type = IdType.UUID)
	private String id;
}
