package com.lawencon.elearning.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.elearning.dao.categoriesDao;
import com.lawencon.elearning.model.Categories;
@Service
@Transactional
public class CategoriesServiceImpl implements CategoriesService {
	
	@Autowired
	private categoriesDao categoriesService;

	@Override
	public Categories insert(Categories category) throws Exception {
		return categoriesService.insert(category);
	}

}
