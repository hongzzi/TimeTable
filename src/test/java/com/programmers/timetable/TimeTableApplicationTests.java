package com.programmers.timetable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.programmers.timetable.dto.Course;
import com.programmers.timetable.dto.MyCourse;
import com.programmers.timetable.repo.EnrolmentRepo;
import com.programmers.timetable.service.EnrolmentService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TimeTableApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(TimeTableApplicationTests.class);
	
	@Autowired
	EnrolmentRepo dao;
	
	@Autowired
	EnrolmentService service;
	
	/**
	 * Courses table dao Test
	 */
	@Test
	public void CourseTest1() {
		List<Course> courses = dao.selectAll();
		assertThat(courses.size(), is(50));
	}
	@Test
	public void CourseTest2() {
		Course course = dao.selectOne("PG1807-01");
		assertThat(course.getProfessor(), is("±è¿µ¼ø"));
	}
	@Test
	public void CourseTest3() {
		List<Course> courses = dao.selectSearch("¹Ú");
		assertNotNull(courses);
	}
	
	/**
	 * MyCourses table dao Test
	 */
	@Test
	public void MyCourseTest1() {
//		int result = dao.enrolCourse(new MyCourse("PG1807-01", "¿ù", 10, 11));
//		assertThat(result, is(1));
	}
	@Test
	public void MyCourseTest2() {
//		List<MyCourse> courses = dao.selectMyAll();
//		assertNotNull(courses);
	}
	@Test
	public void MyCourseTest3() {
		int result = dao.deleteCourse("PG1807-01");
		assertThat(result, is(2));
	}
	
	/**
	 * Courses table service Test
	 */
	@Test
	public void CourseTestS1() {
		List<Course> courses = service.getCoursesList();
		assertThat(courses.size(), is(50));
	}
	@Test
	public void CourseTestS2() {
		Course course = service.getCourseDetail("PG1807-01");
		assertThat(course.getProfessor(), is("±è¿µ¼ø"));
	}
	@Test
	public void CourseTestS3() {
		List<Course> courses = service.getSearchList("¹Ú");
		assertNotNull(courses);
	}
	
	
	

}
