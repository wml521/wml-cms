package com.wml.cms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.wml.cms.dao.ChooseDao;
import com.wml.cms.domain.Article;
import com.wml.cms.service.ArticleService;
import com.wml.cms.service.ChooseService;
import com.wml.common.utils.DateUtil;

/** 
 * @author by WangMaoLin
 * @version 2020年3月4日 上午9:19:23 
 * 
 */
@Service
public class ChooseServiceImpl implements ChooseService{
	@Autowired
	private ChooseDao chooseDao;

	@Override
	public Boolean updateChoose() {
		// TODO Auto-generated method stub
		chooseDao.delete();
		Date d1 = DateUtil.getInitMonth(new Date());
		Date d2 = DateUtil.getEndMonth(new Date());
		int i = chooseDao.insertChoose(d1,d2);
		return i>0;
	}

	
}	
