package com.wml.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wml.cms.dao.SlideDao;
import com.wml.cms.domain.Slide;
import com.wml.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {
	@Resource
	private SlideDao slideDao;

	@Override
	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideDao.selects();
	}

	

}
