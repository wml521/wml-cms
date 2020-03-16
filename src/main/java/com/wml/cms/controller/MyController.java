package com.wml.cms.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wml.cms.domain.Article;
import com.wml.cms.domain.User;
import com.wml.cms.service.ArticleService;

/**
 * @author by WangMaoLin
 * @version 2020年3月4日 下午2:59:49
 * 
 */
@RequestMapping("my")
@Controller
public class MyController {
	@Autowired
	private ArticleService articleService;

	/**
	 * 
	 * @Title: index
	 * @Description: 进入个人中心
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = { "", "/", "index" })
	public String index() {
		return "my/index";
	}

	/**
	 * 
	 * @Title: articles
	 * @Description: 我的文章
	 * @param m
	 * @param page
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("articles")
	public String articles(Model m, HttpSession session,
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "3") Integer pageSize) {
		Article article = new Article();
		User user = (User) session.getAttribute("user");// 从session获取当前登录人的信息
		article.setUserId(user.getId());// 只显示当前登录的人文章
		PageHelper.startPage(page, pageSize);
		List<Article> list = articleService.selects(article);
		PageInfo<Article> info = new PageInfo<Article>(list);
		m.addAttribute("info", info);
		m.addAttribute("list", list);
		return "my/articles";
	}

	/**
	 * 
	 * @Title: articleDetail
	 * @Description: 单个文章
	 * @param id
	 * @return
	 * @return: Article
	 */
	@ResponseBody
	@RequestMapping("articleDetail")
	public Article articleDetail(Integer id) {

		return articleService.select(id);

	}

	/**
	 * 
	 * @Title: publish
	 * @Description: 去发布文章
	 * @return
	 * @return: String
	 */
	@GetMapping("publish")
	public String publish() {
		return "my/publish";
	}

	/**
	 * 
	 * @Title: publish
	 * @Description: 发布文章
	 * @param file
	 * @param article
	 * @return
	 * @return: boolean
	 */
	@ResponseBody
	@PostMapping("publish")
	public boolean publish(MultipartFile file, Article article,
			HttpSession session) {
		// 判断是否有文件上传
		if (null != file && !file.isEmpty()) {
			String path = "d:/pic/";
			// 获取文件名
			String filename = file.getOriginalFilename();
			// 拼接成新文件名
			String newFilename = UUID.randomUUID()
					+ filename.substring(filename.lastIndexOf("."));

			File f = new File(path, newFilename);
			// 文件写入硬盘
			try {
				file.transferTo(f);
				article.setPicture(newFilename);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 文章初始数据
		User user = (User) session.getAttribute("user");
		article.setUserId(user.getId());// 发布人
		article.setCreated(new Date());
		article.setHits(0);// 点击量默认 0
		article.setDeleted(0);// 默认未删除
		article.setHot(0);// 默认非热门
		article.setStatus(0);// 默认待审核
		return articleService.insert(article) > 0;
	}
}
