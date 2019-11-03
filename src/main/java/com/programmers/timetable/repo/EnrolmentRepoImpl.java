package com.programmers.timetable.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.programmers.timetable.TimeTableApplicationTests;
import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;

@Repository
public class EnrolmentRepoImpl implements EnrolmentRepo {

	private final String namespace = "sql.enrolment.";
	private static Logger logger = LoggerFactory.getLogger(EnrolmentRepoImpl.class);

	@Autowired
	SqlSession session;
	@Override
	public List<Course> selectAll() {
		logger.trace("selectAll : {}");
		return session.selectList(namespace + "selectCourse");
	}

	@Override
	public Course selectOne(String code) {
		logger.trace("selectOne : {}", code);
		Map<String, String> map = new HashMap<>();
		map.put("code", code);
		return session.selectOne(namespace + "selectCourse", map);
	}

	@Override
	public List<Course> selectSearch(String keyword) {
		logger.trace("selectSearch : {}", keyword);
		Map<String, String> map = new HashMap<>();
		map.put("keyword", keyword);
		return session.selectList(namespace + "selectCourse", map);
	}

	@Override
	public int enrolCourse(MyCourse mc) {
		logger.trace("insertCourse : {} ", mc);
		return session.insert(namespace+"enrolCourse", mc);
	}

	@Override
	public List<MyCourse> selectMyAll() {
		return session.selectList(namespace + "selectMyCourse");
	}

	@Override
	public int deleteCourse(String code) {
		return session.delete(namespace + "removeMyCourse", code);
	}

	@Override
	public List<MyCourse> checkTable(Course c) {
		return session.selectList(namespace+"selectMyCourse", c);
	}

}
