package com.spring.shop.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.shop.dao.NoticeDao;
import com.spring.shop.dto.NoticeDto;

public class NoticeService {

	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<NoticeDto> getListAll(){
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		ArrayList<NoticeDto> list = dao.selectAll();
		return list;
	}
	
	public boolean isInsert(NoticeDto noticeDto) {
		boolean result = false;
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		int temp = dao.write(noticeDto);
		if(temp == 1) {
			result = true;
		}
		return result;
	}
	
	public boolean isUpdate(NoticeDto noticeDto) {
		boolean result = false;
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		int temp = dao.modify(noticeDto);
		if(temp == 1) {
			result = true;
		}
		return result;
	}
	
	public boolean isDelete(NoticeDto noticeDto) {
		boolean result = false;
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		int temp = dao.delete(noticeDto);
		if(temp == 1) {
			result = true;
		}
		return result;
	}
}
