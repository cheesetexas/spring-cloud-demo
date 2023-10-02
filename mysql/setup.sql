create table DB_BOOK
(
    bid    int auto_increment,
    title  varchar(255) not null,
    `desc` varchar(255) not null,
    constraint DB_BOOK_pk
        primary key (bid)
);

create table DB_USER
(
    uid  int auto_increment,
    name varchar(255)            not null,
    age  int                     not null,
    sex  enum ('male', 'female') not null,
    constraint DB_USER_pk
        primary key (uid)
);

create table DB_BORROW
(
    id  int auto_increment
        primary key,
    uid int not null,
    bid int not null,
    constraint unique_bid_uid
        unique (uid, bid),
    constraint f_bid
        foreign key (bid) references DB_BOOK (bid),
    constraint f_uid
        foreign key (uid) references DB_USER (uid)
);

insert into DB_USER values (null, 'texas', 22, 'female');
insert into DB_BOOK values (null, '深入理解Java虚拟机', '讲解JVM底层原理');
insert into DB_BOOK values (null, 'Java核心技术卷一', '讲解Java的基础知识等');
insert into DB_BORROW values (null, '1', '1');
insert into DB_BORROW values (null, '1', '2');