package com.wml.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wml.cms.dao.CommentDao;
import com.wml.cms.domain.Article;
import com.wml.cms.domain.Comment;
import com.wml.cms.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Resource
	private CommentDao commentDao;

	@Override
	public int insert(Comment comment) {
		return commentDao.insert(comment);
	}

	@Override
	public PageInfo<Comment> selects(Article article, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Comment> list = commentDao.selects(article);
		return new PageInfo<Comment>(list);
	}

}
