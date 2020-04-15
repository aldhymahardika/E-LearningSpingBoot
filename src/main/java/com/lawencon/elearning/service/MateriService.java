package com.lawencon.elearning.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.lawencon.elearning.model.Materi;

public interface MateriService {
	abstract Materi insertMateri(MultipartFile file) throws Exception;
	abstract List<Materi> findByWeekAndDay(int week, int day) throws Exception;
	abstract  List<Map<String, Object>> findByCategory(String category, String pengajar, int week, int day) throws Exception;
}
