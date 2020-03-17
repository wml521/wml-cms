package com.wml.cms.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author by WangMaoLin
 * @version 2020年3月17日 上午9:00:42 
 * 
 */

public class Choose implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date chooseDate;
	private Integer articleId;
	private String option;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getChooseDate() {
		return chooseDate;
	}
	public void setChooseDate(Date chooseDate) {
		this.chooseDate = chooseDate;
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
	
}
