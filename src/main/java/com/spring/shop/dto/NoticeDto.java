package com.spring.shop.dto;

public class NoticeDto {
	private int noticeId; // int(3) not null AUTO_INCREMENT,
	private String noticeWriter; // varchar(100) not null,
	private String noticeTitle; // varchar(100) not null,
	private String noticeContent; // varchar(500) not null,
	private String noticeDate; // varchar(100) not null,
	private String noticeUpdateDate; // varchar(100) not null,
	private int noticeHit; // int(5) not null default 0,
	
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}
	public String getNoticeUpdateDate() {
		return noticeUpdateDate;
	}
	public void setNoticeUpdateDate(String noticeUpdateDate) {
		this.noticeUpdateDate = noticeUpdateDate;
	}
	public int getNoticeHit() {
		return noticeHit;
	}
	public void setNoticeHit(int noticeHit) {
		this.noticeHit = noticeHit;
	}

	@Override
	public String toString() {
		return "NoticeDto [noticeId=" + noticeId + ", noticeWriter=" + noticeWriter + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeDate=" + noticeDate + ", noticeUpdateDate="
				+ noticeUpdateDate + ", noticeHit=" + noticeHit + "]";
	}

}
