package com.lawencon.elearning.dao;

import java.util.List;
import java.util.Map;

import com.lawencon.elearning.model.Materi;

public interface MateriDao {
	
	abstract Materi insertMateri(Materi materi)throws Exception;
	abstract List<Materi> findByWeekAndDay(int week, int day) throws Exception;
	abstract  List<Map<String, Object>>  findByCategory(String category, String pengajar, int week, int day) throws Exception;
}
