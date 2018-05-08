package com.spring.shop.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.shop.dao.ILoginDao;
import com.spring.shop.dto.UserInfoDto;

@Service
public class LoginService {

	@Autowired
	private SqlSession sqlSession;

	@Transactional
	public int signUp(UserInfoDto userInfoDto) {
		// TODO Auto-generated method stub
		int result = 0;
		ILoginDao dao = sqlSession.getMapper(ILoginDao.class);
	
		result = dao.signUp(userInfoDto);
		result = dao.signUpRole(userInfoDto);
	
		return result;
	}
}
