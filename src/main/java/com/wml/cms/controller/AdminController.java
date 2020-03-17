package com.wml.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wml.cms.domain.Article;
import com.wml.cms.domain.User;
import com.wml.cms.service.ArticleService;
import com.wml.cms.service.ChooseService;
import com.wml.cms.service.UserService;

/** 
 * @author by WangMaoLin
 * @version 2020年3月6日 下午3:05:49 
 * 
 */
@RequestMapping("admin")
@Controller
public class AdminController {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private UserService userService;
	@Autowired
	private ChooseService chooseService;
	/**
	 * 
	 * @Title: index 
	 * @Description: 管理员首页
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = {"","/","index"})
	public String index(){
		return "admin/index";
	}
	/**
	 * 
	 * @Title: articles 
	 * @Description: 文章列表
	 * @param m
	 * @param article
	 * @param page
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("articles")
	public String articles(Model m,Article article,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="3")Integer pageSize){
		
		PageHelper.startPage(page, pageSize);
		List<Article> list = articleService.selects(article);
		PageInfo<Article> info = new PageInfo<Article>(list);
		m.addAttribute("info", info);
		m.addAttribute("article", article);
		return "admin/articles";
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
	 * @Title: update 
	 * @Description: 修改文章
	 * @return
	 * @return: boolean
	 */
	@ResponseBody
	@RequestMapping("update")
	public boolean update(Article article) {
		return articleService.update(article) >0;
	}
	/**
	 * 
	 * @Title: articles 
	 * @Description: 用户列表
	 * @param m
	 * @param article
	 * @param page
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("users")
	public String users(Model m,User user,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="3")Integer pageSize){
		
		PageHelper.startPage(page, pageSize);
		List<User> list = userService.selects(user);
		PageInfo<User> info = new PageInfo<User>(list);
		m.addAttribute("info", info);
		m.addAttribute("user", user);
		return "admin/users";
	}
	/**
	 * 
	 * @Title: updateUser 
	 * @Description: 更新用户
	 * @return
	 * @return: String
	 */
	@ResponseBody
	@RequestMapping("updateUser")
	public boolean updateUser(User user) {
		
		return userService.update(user) >0;
	}
	/**
	 * 
	 * @Title: choose 
	 * @Description: 进入评选页面
	 * @return
	 * @return: String
	 */
	@RequestMapping("choose")
	public String choose(){
		return "admin/choose";
	}
	/**
	 * 
	 * @Title: choose 
	 * @Description: 更新评选
	 * @return
	 * @return: String
	 */
	@ResponseBody
	@RequestMapping("updateChoose")
	public Boolean updateChoose(){
		Boolean flag = chooseService.updateChoose();
		return flag;
	}
}
