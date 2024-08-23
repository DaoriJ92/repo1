create table tbl_todo,
    tno number primary key,
    title varchar2(100) not null,
    finished char(1)
    );
select * from tbl_todo;

create sequence sql_todo;

isert into tbl_todo (tno, title, duedate, finished)
values (seq_todo.nextval, ;Test 1', '2024-08-13','N');