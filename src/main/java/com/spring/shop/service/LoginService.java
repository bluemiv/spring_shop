package com.spring.shop.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.shop.dao.ILoginDao;
import com.spring.shop.dto.UserInfoDto;

@Service
public class LoginService {

	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Transactional
	public int signUp(UserInfoDto userInfoDto) {
		// TODO Auto-generated method stub
		int result = 0;
		ILoginDao dao = sqlSession.getMapper(ILoginDao.class);
	
		System.out.println("암호화 되기 전 : " + userInfoDto.getUserPwd());
		userInfoDto.setUserPwd(bcryptPasswordEncoder.encode(userInfoDto.getUserPwd()));
		System.out.println("암호화 된 후 : " + userInfoDto.getUserPwd());
		
		result = dao.signUp(userInfoDto);
		result = dao.signUpRole(userInfoDto);
	
		return result;
	}
}
