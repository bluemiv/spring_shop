package com.spring.shop.dao;

import java.util.ArrayList;

import com.spring.shop.dto.UserInfoDto;

public interface ILoginDao {

	// 모든 회원 리스트
	public ArrayList<UserInfoDto> userListAll();
	
	// 내 정보 가져오기
	public UserInfoDto getMyInfo(UserInfoDto userInfoDto);
	
	// 회원가입
	public int signUp(UserInfoDto userInfoDto);
	public int signUpRole(UserInfoDto userInfoDto);
	
	// 정보 수정
	public int modifiedInfo(UserInfoDto userInfoDto);
	
	// 회원 탈퇴
	public int removeUser(UserInfoDto userInfoDto);
}
