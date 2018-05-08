drop table user_role;
create table user_role (
	userEmail varchar(300) not null,
	userRole varchar(100) not null,
	constraint user_rule_pk primary key(userEmail)
);

drop table userInfo;
create table userInfo (
	userEmail varchar(300) not null,
	userPwd varchar(200) not null,
	userName varchar(200) not null,
    userDate varchar(200) not null,
	userGender varchar(100),
	userAge varchar(200),
	userAddress varchar(300),
	constraint userInfo_pk primary key(userEmail)
);

insert into userInfo(userEmail, userPwd, userName, userDate, userGender, userAge, userAddress) values('7538518@naver.com', '123', 'hongku', now(), null, null, null);
insert into user_role(userEmail, userRole) values('7538518@naver.com', 'ROLE_ADMIN');

delete a, b
from userInfo as a, user_role as b
where a.userEmail = b.userEmail and a.userEmail = '7538518@naver.com';