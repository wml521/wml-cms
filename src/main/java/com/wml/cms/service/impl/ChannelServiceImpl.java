package com.wml.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wml.cms.dao.ChannelDao;
import com.wml.cms.domain.Category;
import com.wml.cms.domain.Channel;
import com.wml.cms.service.ChannelService;

/** 
 * @author by WangMaoLin
 * @version 2020年3月5日 下午3:26:50 
 * 
 */
@Service
public class ChannelServiceImpl implements ChannelService{
	@Autowired
	private ChannelDao channelDao;

	@Override
	public List<Channel> selects() {
		// TODO Auto-generated method stub
		return channelDao.selects();
	}

	@Override
	public List<Category> selectByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return channelDao.selectByChannelId(channelId);
	}
}
