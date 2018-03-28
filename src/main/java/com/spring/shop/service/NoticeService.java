package com.spring.shop.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.shop.dao.INoticeDao;
import com.spring.shop.dto.NoticeDto;

@Service
public class NoticeService {

	@Autowired
	private SqlSession sqlSession;

	public ArrayList<NoticeDto> getListAll() {
		INoticeDao dao = sqlSession.getMapper(INoticeDao.class);
		ArrayList<NoticeDto> list = dao.selectAll();
		return list;
	}

	public boolean isInsert(NoticeDto noticeDto) {
		boolean result = false;
		INoticeDao dao = sqlSession.getMapper(INoticeDao.class);
		int temp = dao.write(noticeDto);
		if (temp == 1) {
			result = true;
		}
		return result;
	}

	public boolean isUpdate(NoticeDto noticeDto) {
		boolean result = false;
		INoticeDao dao = sqlSession.getMapper(INoticeDao.class);
		int temp = dao.modify(noticeDto);
		if (temp == 1) {
			result = true;
		}
		return result;
	}

	public boolean isDelete(NoticeDto noticeDto) {
		boolean result = false;
		INoticeDao dao = sqlSession.getMapper(INoticeDao.class);
		int temp = dao.delete(noticeDto);
		if (temp == 1) {
			result = true;
		}
		return result;
	}
}
