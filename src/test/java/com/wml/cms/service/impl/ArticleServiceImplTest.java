package com.wml.cms.service.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wml.cms.domain.Article;
import com.wml.cms.service.ArticleService;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:20:46 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class ArticleServiceImplTest {
	@Autowired
	private ArticleService articleService;

	@Test
	public void testAdd() {
		Article article = new Article();
		article.setTitle("test");
		article.setUserId(1);
		article.setChannelId(1);
		article.setCategoryId(1);
		article.setContent("测试");
		article.setCreated(new Date());
		
		articleService.insert(article);
	}

	@Test
	public void testSelects() {
		List<Article> selects = articleService.selects(null);
		System.out.println(selects);
	}

}
