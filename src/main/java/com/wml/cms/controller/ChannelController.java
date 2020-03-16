package com.wml.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wml.cms.domain.Category;
import com.wml.cms.domain.Channel;
import com.wml.cms.service.ChannelService;

/** 
 * @author by WangMaoLin
 * @version 2020年3月5日 下午3:26:00 
 * 
 */
@Controller
@RequestMapping("channel")
public class ChannelController {
	@Autowired
	private ChannelService channelService;
	/**
	 * 
	 * @Title: channels 
	 * @Description: 查询所有栏目
	 * @return
	 * @return: List<Channel>
	 */
	@ResponseBody
	@RequestMapping("channels")
	public List<Channel> channels(){
		return channelService.selects();
	}
	/**
	 * 
	 * @Title: channels 
	 * @Description: 根据栏目查分类
	 * @return
	 * @return: List<Channel>
	 */
	@ResponseBody
	@RequestMapping("selectByChannelId")
	public List<Category> selectByChannelId(Integer channelId){
		return channelService.selectByChannelId(channelId);
	}
}
