package com.lawencon.elearning.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.elearning.dao.PengajarDao;
import com.lawencon.elearning.model.Pengajar;
@Repository
public class PengajarDaoImpl extends BaseHibernate implements PengajarDao{
	
	@Override
	public Pengajar findById(String name) throws Exception {
		Query q = em.createNativeQuery("select p.id as id, p.name as trainer_name, p.email as trainer_email from tb_pengajar p where p.name = :param").setParameter("param", name);
		Pengajar pengajar = (Pengajar) q.getSingleResult();
		return pengajar;
	}

	@Override
	public Pengajar insertPengajar(Pengajar pengajar) throws Exception {
		em.persist(pengajar);
		return pengajar;
	}
	
	

}
