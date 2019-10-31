package com.programmers.timetable.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.service.EnrolmentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/timetable/rest")
public class EnrolmentRestController {
	
	private static Logger logger = LoggerFactory.getLogger(EnrolmentRestController.class);
	
	@Autowired
	EnrolmentService service;

	@GetMapping("/courses")
	@ApiOperation("��� ���� ���� ��ȯ")
	public ResponseEntity<Map<String, Object>> initList() {
		try {
			List<Course> list = service.getCoursesList();
			return response(list, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("��ȸ ����", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@GetMapping("/courses/detail/{code}")
	@ApiOperation("���� �� ���� ��ȯ")
	public ResponseEntity<Map<String, Object>> courseDetail(@PathVariable String code) {
		try {
			Course course = service.getCourseDetail(code);
			return response(course, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("��ȸ ����", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@GetMapping("/courses/search/{keyword}")
	@ApiOperation("���� �˻� ���� ��ȯ")
	public ResponseEntity<Map<String, Object>> courseSearch(@PathVariable String keyword) {
		try {
			List<Course> list = service.getSearchList(keyword);
			return response(list, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("��ȸ ����", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	
	
	private ResponseEntity<Map<String, Object>> response(Object data, HttpStatus httpstatus, boolean status) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("status", status);
		resultMap.put("data", data);
		return new ResponseEntity<Map<String, Object>>(resultMap, httpstatus);
		
	}
}
