package com.programmers.timetable.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

// Enrolled Lectures
@Alias(value = "mycourse")
public class MyCourse {
	private int cNum;
	private String code;
	private String lecture;
	private String location;
	private String dayofweek;
	private int startTime;
	private int endTime;
	private List<Memo> memoList;

	public MyCourse() {
		super();
	}

	public MyCourse(String code, String dayofweek, int startTime, int endTime) {
		super();
		this.code = code;
		this.dayofweek = dayofweek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public MyCourse(int cNum, String code, String lecture, String location, String dayofweek, int startTime,
			int endTime) {
		super();
		this.cNum = cNum;
		this.code = code;
		this.lecture = lecture;
		this.location = location;
		this.dayofweek = dayofweek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDayofweek() {
		return dayofweek;
	}

	public void setDayofweek(String dayofweek) {
		this.dayofweek = dayofweek;
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

	public List<Memo> getMemoList() {
		return memoList;
	}

	public void setMemoList(List<Memo> memoList) {
		this.memoList = memoList;
	}

}
