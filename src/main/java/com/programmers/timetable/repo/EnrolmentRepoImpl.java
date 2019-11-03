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

	/**
	 * 전체 강좌
	 */
	@Override
	public List<Course> selectAll() {
		// 전체 목록 조회
		logger.trace("selectAll : {}");
		return session.selectList(namespace + "selectCourse");
	}

	@Override
	public Course selectOne(String code) {
		// 강좌 상세 조회
		logger.trace("selectOne : {}", code);
		Map<String, String> map = new HashMap<>();
		map.put("code", code);
		return session.selectOne(namespace + "selectCourse", map);
	}

	@Override
	public List<Course> selectSearch(String keyword) {
		// 강좌 검색 (코드, 강의명, 교수이름)
		logger.trace("selectSearch : {}", keyword);
		Map<String, String> map = new HashMap<>();
		map.put("keyword", keyword);
		return session.selectList(namespace + "selectCourse", map);
	}

	/**
	 * 수강중인 강좌
	 */
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

}
