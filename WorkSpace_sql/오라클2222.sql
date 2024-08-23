create table restaurant (
    res_id varchar(255) not null,
    res_tel varchar(255) null,
    res_adr varchar(255) null,
    res_name varchar(255) null,
    primary key (res_id)
);

create table menu (
    menu_id varchar(255) not null,
    menu_name varchar(255) null,
    menu_price varchar(255) null,
    res_id varchar(255) not null,
    primary key (menu_id),
    foreign key (res_id) references restaurant(res_id)
);

create table member (
    mem_id varchar(255) not null,
    mem_name varchar(255) null,
    mem_tel varchar(255) null,
    primary key (mem_id)
);

create table ord (
    ord_id varchar(255) not null,
    request varchar(255) null,
    ord_count varchar(255) null,
    amount varchar(255) null,
    menu_id2 varchar(255) not null,
    mem_id varchar(255) not null,
    primary key (ord_id),
    foreign key (menu_id2) references menu(menu_id),
    foreign key (mem_id) references member(mem_id)
);

create table ord_menu (
    menu_id varchar(255) not null,
    ord_id varchar(255) not null,
    foreign key (menu_id) references menu(menu_id),
    foreign key (ord_id) references ord(ord_id)
);

-- 데이터 삽입
insert into restaurant(res_id, res_tel, res_adr, res_name)
values ('01', '041-111-1111', '천안시 대흥동', '달식당');

insert into menu(menu_id, menu_name, menu_price, res_id)
values('01_1', '달돈까스', '10000', '01');

insert into member(mem_id, mem_name, mem_tel)
values('92_1','정다올','01054704075');

insert into ord(ord_id, request, ord_count, amount, menu_id2, mem_id)
values ('1', '소스 많이 주세요', '1', '10000', '01_1', '92_1');

insert into ord_menu(menu_id, ord_id)
values('01_1','1');

select m.mem_name as name, r.res_name as restaurant, mn.menu_name as menu, 
       o.ord_count as count, o.amount as amount, o.request
from member m
join ord o on m.mem_id = o.mem_id
join menu mn on o.menu_id2 = mn.menu_id
join restaurant r on mn.res_id = r.res_id
where m.mem_name = '정다올';


