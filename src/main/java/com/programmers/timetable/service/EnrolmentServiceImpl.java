package com.programmers.timetable.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmers.timetable.controller.EnrolmentRestController;
import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;
import com.programmers.timetable.repo.EnrolmentRepo;

@Service
public class EnrolmentServiceImpl implements EnrolmentService{

	private static Logger logger = LoggerFactory.getLogger(EnrolmentRestController.class);
	
	@Autowired
	EnrolmentRepo repo;
	
	@Override
	public List<Course> getCoursesList() {
		return repo.selectAll();
	}

	@Override
	public Course getCourseDetail(String code) {
		return repo.selectOne(code);
	}

	@Override
	public List<Course> getSearchList(String keyword) {
		return repo.selectSearch(keyword);
	}

	@Override
	@Transactional
	public int enrolCourse(MyCourse mc) {
		int row = 0;
		String dayofweek = mc.getDayofweek();
		for (int i = 0; i < dayofweek.length(); i++) {
			mc.setDayofweek(String.valueOf(dayofweek.charAt(i)));
			row += repo.enrolCourse(mc);
			logger.trace("enrolCourse : {}", mc.getDayofweek());
		}
		return row;
	}

	@Override
	public List<MyCourse> getMyAllCourse() {
		return repo.selectMyAll();
	}

	@Override
	public int removeCourse(String code) {
		return repo.deleteCourse(code);
	}

}
