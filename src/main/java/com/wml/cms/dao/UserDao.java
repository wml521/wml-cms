package com.wml.cms.dao;

import java.util.List;

import com.wml.cms.domain.User;

/** 
 * @author by WangMaoLin
 * @version 2020年3月8日 上午9:32:43 
 * 
 */

public interface UserDao {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 用户列表
	 * @param user
	 * @return
	 * @return: List<User>
	 */
	List<User> selects(User user);
	/**
	 * 
	 * @Title: update 
	 * @Description: 更新
	 * @param user
	 * @return
	 * @return: int
	 */
	int update(User user);
	/**
	 * 
	 * @Title: insert 
	 * @Description: 注册用户
	 * @param user
	 * @return
	 * @return: int
	 */
	int insert(User user);
	/**
	 * 
	 * @Title: selectByUsername 
	 * @Description: 根据用户查询查询用户是否存在
	 * @param username
	 * @return
	 * @return: User
	 */
	User selectByUsername(String username);
}
