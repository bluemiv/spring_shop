delete table user_role;
create table user_role{
	userId int(3) not null,
	userRole varchar(100) not null,
	contraint user_rule_pk primary key(userId)
};

delete table userInfo;
create table userInfo{
	userId int(3) not null,
	userPwd varchar(200) not null,
	userName varchar(200) not null,
	userAge varchar(200),
	userAddress varchar(300),
	userEmail varchar(300),
	contraint userInfo_pk primary key(userId)
};

