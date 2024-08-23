create table tbl_todo(
tno number primary key,
title varchar2(100) not null,
duedate date not null,
finished char(1)
);

select * from tbl_todo;

create sequence seq_todo;

insert into tbl_todo(tno, title, duedate, finished)
values(seq_todo.nextval, 'Test 3', '2024-08-13', 'N');


commit;