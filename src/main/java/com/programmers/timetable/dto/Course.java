package com.programmers.timetable.dto;

import org.apache.ibatis.type.Alias;

@Alias(value = "course")
public class Course {
	private String code;
	private String lecture;
	private String professor;
	private String location;
	private int startTime;
	private int endTime;
	private String dayofweek;
	private String description;
	
	public Course() {
		super();
	}

	public Course(String code, String lecture, String professor, String location, int startTime, int endTime,
			String dayofweek, String description) {
		super();
		this.code = code;
		this.lecture = lecture;
		this.professor = professor;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.dayofweek = dayofweek;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public String getDayofweek() {
		return dayofweek;
	}

	public void setDayofweek(String dayofweek) {
		this.dayofweek = dayofweek;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", lecture=" + lecture + ", professor=" + professor + ", location=" + location
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", dayofweek=" + dayofweek + "]";
	}
	
}
