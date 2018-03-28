delete table notice;
create table notice(
	noticeId int(3) not null AUTO_INCREMENT,
	noticeWriter varchar(100) not null,
	noticeTitle varchar(100) not null,
	noticeContent varchar(500) not null,
	noticeDate varchar(100) not null,
	noticeUpdateDate varchar(100) not null,
	noticeHit int(5) not null default 0,	
	constraint notice_pk primary key(noticeId)
);
insert into notice(noticeWriter, noticeTitle, noticeContent, noticeDate, noticeUpdateDate, noticeHit)
values('hong', '안녕하십니까', '여기는 공지 게시판입니다.', now(), now(), 0);