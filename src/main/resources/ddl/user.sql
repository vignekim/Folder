use edu;

create table user2 (
	no 		int 			not null auto_increment primary key,
	name 	varchar(100) 	not null,
	email 	varchar(200) 	null,
	regDate datetime 		not null default now()
);