drop table user_role;
create table user_role (
	userEmail varchar(300) not null,
	userRole varchar(100) not null,
	constraint user_rule_pk primary key(userId)
);

drop table userInfo;
create table userInfo (
	userEmail varchar(300) not null,
	userPwd varchar(200) not null,
	userName varchar(200) not null,
    userDate varchar(200) default now(),
	userAge varchar(200),
	userAddress varchar(300),
	constraint userInfo_pk primary key(userEmail)
);

