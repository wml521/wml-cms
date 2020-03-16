package com.wml.cms.dao;

import java.util.List;

import com.wml.cms.domain.Category;
import com.wml.cms.domain.Channel;

/** 
 * @author by WangMaoLin
 * @version 2020年3月5日 下午3:27:41 
 * 
 */

public interface ChannelDao {

	List<Channel> selects();

	List<Category> selectByChannelId(Integer channelId);
}
