package com.wml.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wml.cms.domain.Article;
import com.wml.cms.domain.ArticleVO;
import com.wml.cms.domain.ChooseResult;

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
	//查询评选项
	List<Article> selectChoose();
	//添加评选结果
	int addChooseResult(List<ChooseResult> list);
	//查询结果
	List<Article> selectChooses();
}
