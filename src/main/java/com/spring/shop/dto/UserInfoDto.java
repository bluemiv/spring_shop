package com.spring.shop.dto;

public class UserInfoDto {
	private String userEmail; // varchar(300) not null,
	private String userPwd; // varchar(200) not null,
	private String userName; // varchar(200) not null,
	private String userDate; // varchar(200) default now(),
	private String userGender; // varchar(100),
	private String userAge; // varchar(200),
	private String userAddress; // varchar(300),
	private String userRole; // varchar(100) not null,

	// constructor
	public UserInfoDto() {
	}

	public UserInfoDto(String userEmail, String userPwd, String userName, String userDate, String userGender,
			String userAge, String userAddress, String userRole) {
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userDate = userDate;
		this.userGender = userGender;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.userRole = userRole;
	}

	// get set method
	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDate() {
		return userDate;
	}

	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserInfoDto [userEmail=" + userEmail + ", userPwd=" + userPwd + ", userName=" + userName + ", userDate="
				+ userDate + ", userGender=" + userGender + ", userAge=" + userAge + ", userAddress=" + userAddress
				+ ", userRole=" + userRole + "]";
	}

}
