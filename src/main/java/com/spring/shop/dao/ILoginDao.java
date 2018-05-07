package com.spring.shop.dao;

import java.util.ArrayList;

import com.spring.shop.dto.UserInfoDto;

public interface ILoginDao {

	// ��� ȸ���� ����
	public ArrayList<UserInfoDto> userListAll();
	
	// ȸ������
	public int signUp(UserInfoDto userInfoDto);

	// ���� ����
	public int modifiedInfo(UserInfoDto userInfoDto);
	
	// ȸ�� Ż��
	public int removeUser(UserInfoDto userInfoDto);
}
