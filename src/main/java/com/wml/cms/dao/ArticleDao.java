package com.wml.cms.dao;

import java.util.List;

import com.wml.cms.domain.Article;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:14:11 
 * 
 */

public interface ArticleDao {
	//增加文章
	int insert(Article arcticle);
	//查文章
	List<Article> selects(Article article);
	//查单个文章
	Article select(Integer id);
	//修改文章审核状态
	int update(Article article);
}
