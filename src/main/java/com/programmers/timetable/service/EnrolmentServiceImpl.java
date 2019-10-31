package com.programmers.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.repo.EnrolmentRepo;

@Service
public class EnrolmentServiceImpl implements EnrolmentService{

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

}
