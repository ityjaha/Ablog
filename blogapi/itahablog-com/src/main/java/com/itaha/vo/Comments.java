/*#
 #*/
package com.itaha.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * ���⣺���۱�
 * </p>
 * <p>
 * ���ܣ�
 * </p>
 * 
 * <pre>
 * ����˵����
 * </pre>
 * <p>
 * �������ڣ�2019��8��16������3:16:36
 * </p>
 * <p>
 * ��ȫ����com.itaha.vo.Comments
 * </p>
 * �鿴������<a href="" target="_blank"></a>
 *
 * ���ߣ�yinjun ���� ����
 * 
 * @version 1.0
 */
@TableName(value = "comments")
public class Comments {
	@TableId(type = IdType.UUID)
	private String id;
}
