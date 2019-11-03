package com.programmers.timetable.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;
import com.programmers.timetable.service.EnrolmentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/timetable/rest")
public class EnrolmentRestController {
	
	private static Logger logger = LoggerFactory.getLogger(EnrolmentRestController.class);
	
	@Autowired
	EnrolmentService service;

	@GetMapping("/courses")
	@ApiOperation("모든 강의 정보 반환")
	public ResponseEntity<Map<String, Object>> initList() {
		try {
			List<Course> list = service.getCoursesList();
			return response(list, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("조회 실패", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@GetMapping("/courses/detail/{code}")
	@ApiOperation("강의 상세 정보 반환")
	public ResponseEntity<Map<String, Object>> courseDetail(@PathVariable String code) {
		try {
			Course course = service.getCourseDetail(code);
			return response(course, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("조회 실패", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@GetMapping("/courses/search/{keyword}")
	@ApiOperation("강의 검색 정보 반환")
	public ResponseEntity<Map<String, Object>> courseSearch(@PathVariable String keyword) {
		try {
			List<Course> list = service.getSearchList(keyword);
			return response(list, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("조회 실패", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@PostMapping("/courses/enrol")
	@ApiOperation("강의 수강하기")
	public ResponseEntity<Map<String, Object>> enrolCourse(@RequestBody Course course) {
		try {
			String code = course.getCode();
			Course c = service.getCourseDetail(code);
			MyCourse mc = new MyCourse(c.getCode(), c.getDayofweek(), c.getStartTime(), c.getEndTime());
			int result = service.enrolCourse(mc);
			return response(result, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("수강 실패", e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@GetMapping("/courses/mycourse")
	@ApiOperation("수강 테이블")
	public ResponseEntity<Map<String,Object>> getMyCourse() {
		try {
			List<MyCourse> list = service.getMyAllCourse();
			return response(list, HttpStatus.OK, true);
		} catch (RuntimeException e) {
			logger.error("getMyCourse : 불러오기 실패",e);
			return response(e.getMessage(), HttpStatus.CONFLICT, false);
		}
	}
	
	@DeleteMapping("/courses/mycourse/delete/{code}")
	@ApiOperation("강의 코드로 수강목록 삭제")
	public ResponseEntity<Map<String,Object>> removeMyCourse(@PathVariable String code) {
		try {
			int result = service.removeCourse(code);
			return response(result, HttpStatus.OK, true);
		} catch(RuntimeException e) {
			logger.error("removeMyCourse 삭제 실패",e);
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
