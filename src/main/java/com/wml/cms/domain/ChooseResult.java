package com.wml.cms.domain;

import java.io.Serializable;

/** 
 * @author by WangMaoLin
 * @version 2020年3月17日 上午9:03:07 
 * 
 */

public class ChooseResult implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userId;
	private Integer articleId;
	private String option;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	@Override
	public String toString() {
		return "ChooseResult [id=" + id + ", userId=" + userId + ", articleId="
				+ articleId + ", option=" + option + "]";
	}
	
}
