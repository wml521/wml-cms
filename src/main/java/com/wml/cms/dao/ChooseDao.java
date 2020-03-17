package com.wml.cms.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wml.cms.domain.Article;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:14:11 
 * 
 */

public interface ChooseDao {
	//删除
	void delete();
	//新增
	int insertChoose(@Param("d1")Date d1, @Param("d2")Date d2);
	
}
