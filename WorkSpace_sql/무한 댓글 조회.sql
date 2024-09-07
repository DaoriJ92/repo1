-- ����Ŭ ������ ����� ���� ��ȸ
select 
    level lv, empno, lpad(' ', 2*level)||ename, mgr
from emp
start with mgr is null -- ������
connect by 
    empno != 7788 
    and prior empno = mgr
order siblings by empno desc;

-- �������� ������ ����� ���� ��ȸ
with emp_recu (lv, empno, ename, mgr) as (
    select 
        1 as lv,
        empno, ename, mgr 
    from emp            -- ��� ���̺�
    where mgr is null   -- ����
    
    union all
    
    select
        er.lv + 1 as lv,
        e.empno, lpad(' ', 2*er.lv)||e.ename, e.mgr
    from emp_recu er
    left outer join emp e on er.empno = e.mgr
    where e.mgr is not null -- ������ �����ϴ� ����
)
search depth first by empno desc set sort_empno_desc  -- ���Ŀ� ���� ���� �� ��Ī
select * from emp_recu
order by sort_empno_desc; -- ���� ��Ī�� Ȱ��


--����¡
select
    rownum, empno, ename
from emp
where rownum < 5
order by empno desc;

/* 5 */select empno as eno
/* 1 */from emp
/* 2 */where eno = 7788
/* 3 */group by depno
/* 4 */having depno in (10, 20)
/* 6 */order by eno;

select rounum rnum, empno, ename
from (
select empno, ename
from emp
order by ename
)
where rownum >= 4 and rownum <= 6;

select *
from (
    select rownum rnum, empno, ename
    from(
        select empno,ename
        from emp2
        order by ename
    )
)
where runum >=4 and rnum <=6;
-- �ѹ��� 3���� �����ִµ� 2��° ������
create table emp2
as select * from emp;
insert into emp2
select * from emp2;

select count(*) from emp2;

drop table emp2;
commit;

select * from emp2;