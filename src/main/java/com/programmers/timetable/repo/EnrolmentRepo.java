package com.programmers.timetable.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.programmers.timetable.dto.Course;

public interface EnrolmentRepo {

	List<Course> selectAll();
	Course selectOne(String code);
	List<Course> selectSearch(String keyword);

}
