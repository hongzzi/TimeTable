package com.programmers.timetable.service;

import java.util.List;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;

public interface EnrolmentService {
	
	List<Course> getCoursesList();
	Course getCourseDetail(String code);
	List<Course> getSearchList(String keyword);

	int enrolCourse(MyCourse mc);
	List<MyCourse> getMyAllCourse();
	int removeCourse(String code);
}
