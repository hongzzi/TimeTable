package com.programmers.timetable.dto;

public class Memo {
	private int mNum;
	private int cNum;
	private String title;
	private String content;
	
	public Memo() {
		super();
	}
	
	public Memo(int mNum, int cNum, String title, String content) {
		super();
		this.mNum = mNum;
		this.cNum = cNum;
		this.title = title;
		this.content = content;
	}

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo [mNum=" + mNum + ", cNum=" + cNum + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
