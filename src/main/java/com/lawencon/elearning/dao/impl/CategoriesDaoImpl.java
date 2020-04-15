package com.lawencon.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.lawencon.elearning.dao.categoriesDao;
import com.lawencon.elearning.model.Categories;

@Repository
public class CategoriesDaoImpl extends BaseHibernate implements categoriesDao {

	@Override
	public Categories insert(Categories category) throws Exception {
		em.persist(category);
		return category;
	}

}
