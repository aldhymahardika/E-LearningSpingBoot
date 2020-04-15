package com.lawencon.elearning.service;

import com.lawencon.elearning.model.Pengajar;

public interface PengajarService {
	
	abstract Pengajar findById(String id) throws Exception;
	abstract Pengajar insertPengajar(Pengajar pengajar) throws Exception;

}
