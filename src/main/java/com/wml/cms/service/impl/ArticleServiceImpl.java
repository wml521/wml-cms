package com.wml.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wml.cms.dao.ArticleDao;
import com.wml.cms.domain.Article;
import com.wml.cms.domain.ArticleVO;
import com.wml.cms.domain.ChooseResult;
import com.wml.cms.service.ArticleService;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:19:23 
 * 
 */
@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleDao articleDao;

	@Override
	public int insert(Article arcticle) {
		// TODO Auto-generated method stub
		return articleDao.insert(arcticle);
	}

	@Override
	public List<Article> selects(Article article) {
		// TODO Auto-generated method stub
		return articleDao.selects(article);
	}

	@Override
	public Article select(Integer id) {
		// TODO Auto-generated method stub
		return articleDao.select(id);
	}

	@Override
	public int update(Article article) {
		// TODO Auto-generated method stub
		return articleDao.update(article);
	}

	

	@Override
	public List<Article> selectChoose() {
		// TODO Auto-generated method stub
		return articleDao.selectChoose();
	}

	@Override
	public Boolean addChooseResult(List<ChooseResult> list) {
		// TODO Auto-generated method stub
		return articleDao.addChooseResult(list)>0;
	}

	@Override
	public List<Article> selectChooses() {
		// TODO Auto-generated method stub
		return articleDao.selectChooses();
	}

	
}	
