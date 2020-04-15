package com.lawencon.elearning.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.elearning.dao.PengajarDao;
import com.lawencon.elearning.model.Pengajar;
@Service
@Transactional
public class PengajarServiceImpl implements PengajarService {
	
	@Autowired
	private PengajarDao pengajarService;

	@Override
	public Pengajar findById(String id) throws Exception {
		return pengajarService.findById(id);
	}

	@Override
	public Pengajar insertPengajar(Pengajar pengajar) throws Exception {
		return pengajarService.insertPengajar(pengajar);
	}

}
