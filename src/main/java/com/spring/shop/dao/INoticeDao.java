package com.spring.shop.dao;

import java.util.ArrayList;

import com.spring.shop.dto.NoticeDto;

public interface INoticeDao {

	// 모든 글 가져오기
	public ArrayList<NoticeDto> selectAll();

	// content 가져오기
	public NoticeDto select(NoticeDto noticeDto);

	// 글 작성
	public int write(NoticeDto noticeDto);

	// 글 수정
	public int modify(NoticeDto noticeDto);

	// 조회수 증가
	public int hit_increment(NoticeDto noticeDto);

	// 글 삭제
	public int delete(NoticeDto noticeDto);

}
