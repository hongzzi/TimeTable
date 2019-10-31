package com.programmers.timetable.service;

import java.util.List;

import com.programmers.timetable.dto.Course;

public interface EnrolmentService {
	
	List<Course> getCoursesList();
	Course getCourseDetail(String code);
	List<Course> getSearchList(String keyword);
	
}
