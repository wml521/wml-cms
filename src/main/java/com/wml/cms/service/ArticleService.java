package com.wml.cms.service;

import java.util.List;

import com.wml.cms.domain.Article;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:18:38 
 * 
 */

public interface ArticleService {
	//增加文章
	int insert(Article arcticle);
	//查文章
	List<Article> selects(Article article);
	//查询单个文章
	Article select(Integer id);
	//修改审核状态
	int update(Article article);
}
