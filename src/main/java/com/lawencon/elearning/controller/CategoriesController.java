package com.lawencon.elearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lawencon.elearning.model.Categories;
import com.lawencon.elearning.service.CategoriesService;

@RestController
public class CategoriesController extends BaseController<Categories> {
	
	@Autowired
	private CategoriesService categoryService;
	
	@PostMapping("category/insert")
	public ResponseEntity<?> insertCategory(@RequestBody String body){
		try {
			Categories category = readValue(body, Categories.class);
			categoryService.insert(category);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Failed to insert", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}


}
