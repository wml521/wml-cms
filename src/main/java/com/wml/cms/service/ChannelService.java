package com.wml.cms.service;

import java.util.List;

import com.wml.cms.domain.Category;
import com.wml.cms.domain.Channel;

/** 
 * @author by WangMaoLin
 * @version 2020年3月5日 下午3:26:36 
 * 
 */

public interface ChannelService {

	List<Channel> selects();

	List<Category> selectByChannelId(Integer channelId);
}
