package com.lawencon.elearning.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.lawencon.elearning.dao.MateriDao;
import com.lawencon.elearning.model.Materi;

@Service
@Transactional
public class MateriServiceImpl implements MateriService{
	
	@Autowired
	@Qualifier("materi_repo_hibernate")
	private MateriDao materiservice;

	@Override
	public Materi insertMateri(MultipartFile file) throws Exception {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Materi materi = new Materi();
		materi.setJudulMateri(fileName);
		materi.setTypeFile(file.getContentType());
		materi.setFileMateri(file.getBytes());
		materi.setActiveFlag('Y');
		return materiservice.insertMateri(materi);
	}

	@Override
	public List<Materi> findByWeekAndDay(int week, int day) throws Exception {
		return materiservice.findByWeekAndDay(week, day);
	}

	@Override
	public  List<Map<String, Object>> findByCategory(String category, String pengajar, int week, int day) throws Exception {
		return materiservice.findByCategory(category, pengajar, week, day);
	}

}
