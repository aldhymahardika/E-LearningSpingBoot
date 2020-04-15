package com.lawencon.elearning.dao;

import com.lawencon.elearning.model.Pengajar;

public interface PengajarDao {
	abstract Pengajar findById(String name) throws Exception;
	abstract Pengajar insertPengajar(Pengajar pengajar) throws Exception;

}
