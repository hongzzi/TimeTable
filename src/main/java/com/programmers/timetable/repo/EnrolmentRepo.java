package com.programmers.timetable.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;

public interface EnrolmentRepo {

	List<Course> selectAll();
	Course selectOne(String code);
	List<Course> selectSearch(String keyword);

	int enrolCourse(MyCourse mc);
	List<MyCourse> selectMyAll();
	int deleteCourse(String code);
}
