package com.programmers.timetable.dto;

import java.util.List;

// Enrolled Lectures
public class MyCourse {
	private int cNum;
	private String code;
	private String dayofweek;
	private List<Memo> memoList;

	public MyCourse() {
		super();
	}

	public MyCourse(int cNum, String code, String dayofweek) {
		super();
		this.cNum = cNum;
		this.code = code;
		this.dayofweek = dayofweek;
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

	public List<Memo> getMemoList() {
		return memoList;
	}

	public void setMemoList(List<Memo> memoList) {
		this.memoList = memoList;
	}
	
}
