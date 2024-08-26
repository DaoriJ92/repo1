-- ���� �ּ�
/* ���� �ּ� */
SELECT
    *
FROM
    emp;
-- sql developer �ڵ� ���� ����Ű : Ctrl + F7
SELECT
    empno,-- ��ȸ�ϰ� ���� �÷� ����
    ename,
    deptno
FROM
    emp;

SELECT
    1, 'a', 30*654
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- ���� ���� ����Ű : ctrl + shift + d
-- ���� ����� : ctrl + x , alt + shift + d
-- distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�
select distinct deptno from emp;
select distinct job from emp;

select deptno, job from emp;
-- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ°� �����Ѵ�
select distinct deptno, job from emp;

-- null�� �����ϸ� ������ null�̴�
select ename, sal, sal*12+comm, comm from emp;

-- �÷����� ��Ī ���
-- " ���� ����
-- as ���� ����
-- ��Ī�ȿ� ���Ⱑ �ִ� ��� " ���� �Ұ�
-- �����ϸ� ���⺸�� _�� ����
select ename, sal, sal*12+comm as "new sal", comm from emp;

-- order by : �ش� �÷����� ����
-- �������� : asc ��������
-- �������� : desc
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by ù��°�ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
select * from emp
order by deptno asc, sal desc;

select distinct job from emp
order by job;

select * from emp
where deptno = 30;

select * from emp
where empno = 7782;

select * from emp
where sal >= 2000
order by sal;

select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal < 3000;
--2000 <= sal < 3000

select * from emp
--where sal != 3000;
where sal <> 3000;


/*
    !(a != b)
*/
select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where sal >= 2000 and sal <= 3000;

select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- %�� ��ŵ� �������
select * from emp
where ename like 'S%';

select * from emp where ename like 'A%';

-- _�� �� �ѱ����ε� � ���ڴ� ���� ����
select * from emp
where ename like '_L%';

select * from emp
where ename not like '____';

select * from emp
where ename like '%AM%';

select * from emp
where comm <= 400;

select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where comm is not null;

-- emp���� deptno�� 10 �Ǵ� 20�� �����
-- empno, ename, sal, deptno�� ����ϼ���
select empno, ename, sal, deptno from emp
--where deptno = 10 or deptno = 20;
where deptno in (10, 20);

-- ���� �ٸ� ��ȸ ������� �����ݴϴ�.
-- ��, ��ȸ�� �÷��� ����, Ÿ���� ���ƾ� �Ѵ�.
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 20;

-- union : �ߺ��� �ڷḦ ��������
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 10;

-- union all : �ߺ��� ������� �����ش�
select empno, ename, sal, deptno from emp
where deptno = 10
union all
select empno, ename, sal, deptno from emp
where deptno = 10;

-- 125p.
-- Q1
select * from emp where ename like '%S';
-- Q2
select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';
-- Q3
select empno, ename, job, sal, deptno from emp
where deptno in (20, 30) and sal > 2000;
-- Q3-union
select empno, ename, job, sal, deptno from emp
where deptno = 20 and sal > 2000
union all
select empno, ename, job, sal, deptno from emp
where deptno = 30 and sal > 2000;
-- Q4
select * from emp 
where not (2000 <= sal and sal <= 3000);
-- Q5
select ename, empno, sal, deptno
from emp
where ename like '%E%'
and deptno = 30
and not (sal > 1000 and sal < 2000);
-- Q6
select * from emp
where
        comm is null
    and mgr is not null
    and job in ('MANAGER', 'CLERK')
    and ename not like ('_L%');

select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- upper, lower�� ��ҹ��� ���� ���� like�Ҷ� �� ����
select * from emp
where lower(ename) like lower('%Mi%');

-- length : ���� ����
select ename, length(ename)
from emp;

select * from emp 
where length(ename) >= 5;

-- dual : �ӽ� ���̺�
select length('��'), lengthb('��') from dual;

-- substr  : ����̵Ǵ� ����, ������ġ, ������ ����
-- ������ ������ �Ⱦ��ų� �ʹ� ũ�� ������
select 
    job, 
    substr(job, 1, 2), substr(job, 0, 2), 
    substr(job, 3, 3), 
    substr(job, 5),
    ename,
    substr(job, -3, 2),
    length( lower( substr(job, 5, 100) ) )
from emp;

select job, replace(job, 'A', '*') from emp;

select 
    job,
    length(job),
    (length(job)+1) / 2,
    substr(job, (length(job)+1) / 2, 1),
    replace(
        job,
        substr(job, (length(job)+1) / 2, 1),
        '*'
    )
from emp;

-- lpad : ����� �Ǵ� ����, ��ü �ڸ���, ä�� ����
-- ä�� ���� ���� �� ���鹮��
select 
    job,
    lpad(job, 10, '#'),
    lpad(job, 4, '#')
from emp;

select 
    job, length(job), (15 - length(job))/2
from emp;

-- ���� ��� ���� ����
select
    rpad(
        lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*'
        ),
            
        (16 - (length(job)))/2 + length(lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*')
        ),
        
        '*')
from emp;

-- ���ڿ� ���ϱ�
select empno || ename || '��'
from emp;

-- trim : �� �� ���� ����
-- �۾� ������ ������ �������� ����
select 
    '   a b c      ',
    trim('   a b c      ')
from dual;

-- �ǽ����� 1
select
    '210621-3123456',
    '210621-3******'
from dual;

select
    '210621-3' || '******',
    substr('210621-3123456', 1, 8) || '******',
    rpad('210621-3', 14, '*'),
    rpad(
        substr('210621-3123456', 1, 8), 
        length('210621-3123456'), 
        '*'
    )
from dual;

-- �ǽ�����2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : WARD -> WA**, MARTIN -> MA****
-- ������� : �� �α��� + '***'
select 
    ename,
    substr(ename, 1, 2),
    rpad( substr(ename, 1, 2), length(ename), '*'),
    substr(ename, 1, 2) || '***'
from emp;


-- �ǽ�����3
-- �ձ��� �ϳ���
-- WARD -> *ARD, MARTIN -> *ARTIN

select '*' || substr(ename, 2) from emp;

-- �ǽ�����4
-- �ι�° �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename, 1, 1) || '*' || substr(ename, 3) from emp;

-- �ǽ�����5
-- ��� �۾��� *
-- MARTIN -> MA*TIN, SCOTT -> SC*TT
select
    length(ename)/2 + 1,
    substr(ename, 1, length(ename)/2-0.5)|| '*' || substr(ename, length(ename)/2 + 1.5 )
from emp;

select 
    trunc(1234.5678),
    trunc(1234.5678, 2),
    trunc(1234.5678, -2),
    trunc(-12.34)
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

-- sysdate : ���� ����Ŭ pc�� �ð��� ���ɴϴ�
-- ���� pc�� 9�ð� ���� ����(���� 0�� ���� �ѱ� +9��)
-- ��¥ ���� �� �Ϻθ� select�� ǥ�� ��
select sysdate, sysdate+1, sysdate-1 from dual;

-- �÷��� +�� ������ ��� ���ڷ� �����ؼ� ���� ��
-- || ���ڵ� ���ڷ� ����
select
    to_char(sysdate+(9/24), 'yyyy"��" MM"��" dd"��"  hh24"��" mi"��" ss"��"')
from dual;

select 
    sysdate - to_date('2024-05-07', 'yyyy-mm-dd')
from dual;


select
    to_char(to_date('2024-05-07', 'yyyy-mm-dd'), 'yyyy"��" MM"��" dd"��"  hh24"��" mi"��" ss"��"')
from dual;

select 
    comm, 
    nvl(comm, -1),
    sal,
    sal + comm,
    sal + nvl(comm, 0)
from emp;

select * from emp
where comm = 0 or comm is null;

select * from emp
where nvl(comm, 0) = 0;

select
    case
        when 
            comm is null 
            then
--                'N/A'
                0
        else
--            to_char(comm)
--            '' || comm
            comm
    end new_comm
from emp;

-- Q2
select empno, ename, sal,
trunc(sal / 21.5, 2) as day_pay,
round((sal / 21.5) / 8, 1) time_pay1,
trunc(sal / 21.5, 2) / 8 time_pay2
from emp;

-- Q3
select empno, ename, hiredate,
to_char( add_months(hiredate, 3), 'yyyy-mm-dd') r_job_0,
next_day(add_months(hiredate, 3), 2) r_job_1,   -- �Ͽ�1, ����2,..., ���7
comm,
nvl( to_char(comm), 'N/A'),
to_char(null),
case
    when comm is null then 'N/A'
    else to_char(comm)
end,
decode(comm, 
    null, 'N/A',
    comm)   -- decode�� to_char �Ƚᵵ �˾Ƽ� ����
from emp;

-- Q4
select empno, ename, mgr,
case
    when mgr is null then '0000'
    else
        case
            when substr(mgr, 1, 2) = 75 then '5555'
            when substr(mgr, 1, 2) = 76 then '6666'
            else to_char(mgr)
        end
end chg_mgr_1,
case 
    when mgr is null then '0000'
    else
        case substr(mgr, 1, 2)
            when '75' then '5555'
            when '76' then '6666'
            else to_char(mgr)
        end
end chg_mgr_2,
case 
    when mgr is null then '0000'
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else to_char(mgr)
end chg_mgr_3,
case
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else nvl(to_char(mgr), '0000')
end chg_mgr_4,
case
    when substr(mgr, 2, 1) in ('5','6','7','8') 
        then lpad(substr(mgr, 2, 1), 4, substr(mgr, 2, 1))
    else nvl(to_char(mgr), '0000')
end chg_mgr_5,
case
when mgr is null then '0000'
when mgr >= 7500 and mgr < 7600 then '5555'
when mgr >= 7600 and mgr < 7700 then '6666'
when mgr >= 7700 and mgr < 7800 then '7777'
when mgr >= 7800 and mgr < 7900 then '8888'
else to_char(mgr)
end as chg_mgr_6
from emp;

-- countó�� null�� ���ܵ�
-- count�� *�� ���� ��
select sum(sal), count(sal), count(*), count(comm) from emp;

select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- �μ��� �޿� ����, ��� ǥ��
-- deptno, sum, avg
select sum(sal), avg(sal) from emp
where deptno = 10
union all
select sum(sal), avg(sal) from emp
where deptno = 20
union all
select sum(sal), avg(sal) from emp
where deptno = 30;

-- distinctó�� �ߺ��� ��������, �з�����
-- select���� group by�� ���̳� ������ �Լ�(���� �Լ�)�� �� �� ����
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno, sum(sal), count(*) from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
--where count(*) >= 2
group by deptno, job
order by deptno, job;

-- having : group by������ ���ȴ�.
-- �����Լ��� �������� �ɰ� ���� ��쿡 ���
select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal) >= 2000;
--    having count(*) >= 2;
    having deptno = 20;

-- 212p.
-- q1
select 
    deptno, floor(avg(sal)) avg_sal, max(sal) as max_sal, min(sal) min_sal, count(*) cnt
from emp
group by deptno;

-- q2
select job, count(*)
from emp
--where count(*) >= 3
group by job
    having count(*) >= 3
;




/* 5 */ select job, count(*) cnt
/* 1 */ from emp
/* 2 */ where sal > 1000
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;

select * from dept;

select * 
from emp, dept
order by empno;

select 14 * 4 from dual;

select /*emp.ename*/ ename, /*emp.loc*/dept.loc, /*deptno,*/ emp.deptno
from emp, dept
where emp.deptno = dept.deptno
order by empno;
-- ���̺� �ΰ� �̻� ��ȸ�Ҷ� ���踦 �� �˷���� ���ϴ� ������ ��µȴ�
-- ��ü ���̺� �� - 1���� ������ �����ϴ�

select EnAmE
from eMp e, dept d
--where e.deptno = d.deptno;
where E.deptno = d.deptno;


select e.ename from emp e;

-- *�� �÷��� ���� ���� ��� *�� ���̺��� ��������� �Ѵ�.
select ename, e.*, d.*
from eMp e, dept d
--where e.deptno = d.deptno;
where E.deptno = d.deptno;

select ename, emp.* from emp;

select * from salgrade;

select *
from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;

select * from emp;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

-- using���� �Ѵ� ���� �÷����� �ִ� ��츸 �� �� �ִ�
select deptno /*emp.deptno ����*/
from emp join dept using (deptno);

select *
from emp join dept on (emp.deptno = dept.deptno);

select *
from emp e1 join emp e2 on(e1.mgr = e2.empno);

-- left outer join�̶�? ���� ���̺��� ��� ����ϴ°� �������ش�
select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);

-- quiz 1
-- empno, ename, dname, loc ��� : ��� 14��
select empno, ename, dname, loc
from emp, dept
where emp.deptno = dept.deptno
order by emp.deptno;

select empno, ename, dname, loc
from emp join dept using (deptno);

select empno, ename, dname, loc
from emp left outer join dept on(emp.deptno = dept.deptno);

-- quiz 2
-- ���, �̸�, �μ���, �޿������ ��� : ��� 14��
select e.empno, e.ename, d.dname, s.grade
  from emp e, dept d, salgrade s
 where e.deptno = d.deptno
   and (e.sal >= s.losal and e.sal <= s.hisal);

select e.empno, e.ename, d.dname, s.grade
from salgrade s , emp e join dept d using (deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);

select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal);

-- quiz 3
-- ��� ���� ������ ���� ����� �̸�, �޿�, ��� �̸�, �Ŵ��� �޿�
select e1.ename, e1.sal, e1.mgr, e2.empno, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal > e2.sal;

-- q1
select emp.deptno, dept.dname, emp.empno, emp.ename, emp.sal from emp, dept
where emp.deptno = dept.deptno
and sal > 2000
order by deptno;

-- q2
select d.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*)
from emp e left outer join dept d on (e.deptno = d.deptno)
group by d.deptno, d.dname;

-- q3
select *
from dept d left outer join emp e on (e.deptno = d.deptno)
order by d.deptno
;
select sal from emp where ename = 'JONES';

select * from emp
where sal > (select sal from emp where ename = 'JONES');

-- ��� �޿����� ���� �޴� �����
select * from emp
where sal > (select avg(sal) from emp);
-- BLAKE�� ���� ���� ������ �޴� �����
select * from emp
where sal > (select sal from emp where ename = 'BLAKE')
;
-- JONES���� ���� job�� ������ �ִ� �����
select * from emp
where job = (select job from emp where ename = 'JONES');

select * from emp
where sal in (
    select max(sal) from emp group by deptno
);

select *
from (
    select * from emp where deptno = 10
);

select rownum, emp.*
from emp
--where rownum = 2;
order by ename;

select rownum, e.*
from (
    select * from emp order by ename
) e
;

select job, count(*) from emp
group by job
having count(*) >= 3;

select *
from   (select job, count(*) cnt from emp
        group by job)
where cnt >= 3;

with e10 as (
    select * from emp where deptno = 10
)
select * from e10;

-- 262p.
-- q1
select job, empno, ename, sal, deptno, dname
from emp join dept using (deptno)
where job = (select job from emp where ename = 'ALLEN')
order by sal desc, ename;

-- q2
-- ��� �޿� ���
-- ��� �޿����� ���� ����� ���
select * from emp e, dept d, salgrade s
where
    e.deptno = d.deptno
    and e.sal >= s.losal and e.sal <= s.hisal
    and sal > (select avg(sal) from emp)
order by sal desc, empno;

-- q3
select empno, ename, job, e.deptno, dname, loc
from emp e
left outer join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and job not in (select job
                from emp
                where deptno = 30);

/*
select empno, ename, job, deptno, dname, loc
from emp join dept using (deptno)
where deptno = 10 and not (job in (select job from emp where deptno = 30));
*/

-- q4
select empno, ename, sal, grade 
from emp e
left outer join salgrade s 
on(e.sal >= s.losal and e.sal <= s.hisal)
where sal > (select max(sal) from emp where job='SALESMAN');

-- 12��
select * from emp;
desc emp;
select * from salgrade;

create table emp_ddl (
    empno number(4),    -- ���� ���ڸ�
    ename varchar2(10), -- 10 ����Ʈ
    job varchar2(9),    -- ���Ѻ��� ���� �۾��� ������ �۾� ��ŭ�� ������ ����
    mgr number(4),
    hiredate date,
    sal number(7, 2),   -- 2�� �Ҽ��� ��°�ڸ����� ����� �� �ִ�
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

create table dept_ddl
as select * from dept;

select * from dept_ddl;

create table emp_ddl_30
as select empno, ename, sal, deptno from emp where deptno = 30;

select * from emp_ddl_30;

select * from emp
where 1 <> 1;

create table emp_alter
as select * from emp;

select * from emp_alter;

alter table emp_alter
add hp varchar2(20);


alter table emp_alter
rename column hp to tel;

alter table emp_alter
modify empno number(5);

desc emp_alter;

-- ũ�Ⱑ Ŀ���°� ����(�پ��°� �Ұ���)
alter table emp_alter
modify empno number(4);

alter table emp_alter
drop column tel;

select * from emp_alter;

rename emp_alter to emp_rename;

select * from emp_rename;

truncate table emp_rename;

drop table emp_rename;

-- 10��
create table dept_temp
as select * from dept;

select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
values (50, 'DATABASE', 'SEOUL');

insert into dept_temp
values (60, 'network', 'Busan');

-- ���̺��� �ڿ� ()�� �����ϸ� ��� �÷�
insert into dept_temp
values ('network', 60, 'Busan');


insert into dept_temp
values (70, '��', null);
select * from dept_temp;

-- ''�� null�� ���̴µ� �׷��� null�̶�� ����
-- java���� ������ ''�� null�� �ν����� �ʱ� ������.
insert into dept_temp
values (80, 'mobile', '');

-- �÷��� �����ϸ� �ڵ����� null�� ����
insert into dept_temp(deptno, loc)
values (90, '��õ');

select * from dept_temp where loc is null;

create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp (empno, ename, hiredate)
values (9999, 'ȫ�浿', '2001/01/02');

insert into emp_temp (empno, ename, hiredate)
values (1111, '������', '2001-02-03');

insert into emp_temp (empno, ename, hiredate)
values (2111, '�̼���', to_date('2002-03-04', 'yyyy-mm-dd'));

insert into emp_temp (empno, ename, hiredate)
values (3111, '��û��', sysdate);

insert into emp_temp
select * from emp where deptno = 10;

select * from emp_temp;

create table dept_temp2
as select * from dept;

select * from dept_temp2;

update dept_temp2
set loc = 'seoul';

rollback;


-- update �ϱ����� select�� where ������ ��Ȯ���� Ȯ���ϰ�
-- where�� �״�� �����ؼ� update�� �ٿ��ֵ��� ����
update dept_temp2
set loc = 'SEOUL', dname = 'DATAbase'
where deptno = 40;

select * from dept_temp2
where deptno = 40;

create table emp_temp2
as select * from emp;

select * from emp_temp2;

select * from emp_temp2
where job = 'MANAGER';

delete emp_temp2
where job = 'MANAGER';

-- emp_temp2����
-- �޿��� 1000������ �����
-- �޿��� 3% �λ�
-- sal * 1.03
select 
    ename, sal, sal*1.03 
from emp_temp2
where sal <= 1000;

update emp_temp2
set sal = sal*1.03
where sal <= 1000;

delete emp_temp2;

select * from emp_temp2;

rollback;

select * from dict;
select * from user_tables;

select * from USER_CONSTRAINTS;

-- index ����
-- ��������, �������� ���� ����
create index idx_emp_sal
on emp( sal );
select * from user_indexes;

drop index idx_emp_sal;

-- ���� hint
select /*+ index(idx_emp_sal) */
* from emp e
order by empno desc;

-- plan
-- sql developer������ ��� ����° ������ "��ȹ����"

create index idx_emp_empno_desc
on emp( empno desc );

select max(empno)+1 from emp_temp2;

insert into emp_temp2 (
    empno, 
    ename
) values ( 
    (select max(empno)+1 from emp_temp2), 
    '������2'
);
select * from emp_temp2;

-- ������ sequence
create table tb_user (
    user_id number,
    user_name varchar2(30)
);
select * from tb_user;

create sequence seq_user;

select seq_user.nextval from dual;
select seq_user.currval from dual;

insert into tb_user (user_id, user_name)
values (seq_user.nextval, '������1');
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '������2');

insert into tb_user (user_id, user_name)
values (seq_user.nextval, '������3');
select * from tb_user;

create sequence seq_test
start with 10000    -- ���� ����(�⺻��: 1)
increment by 100;   -- ���� ����(�⺻��: 1)

-- nextval�� �ѹ��� ������� ���� ��� 
-- currval ��� ����
select seq_test.currval from dual;
select seq_test.nextval from dual;

-- primary key, PK, �ֿ�Ű, �߿�Ű, �⺻Ű
-- not null + unique ����
-- ������ ���ÿ� index�� ��������
-- create table������ primary key�� �� �ϳ��� ���� ����
-- �ΰ� �̻��� �÷��� primary key ���� �Ϸ��� alter, primary key ���
create table table_pk(
    login_id varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
);
select * from user_constraints
where table_name = 'TABLE_PK3';

select * from user_indexes;

create table table_pk2(
    login_id varchar2(20) constraint pk_table_pk2 primary key,
    login_pwd varchar2(20) constraint nn_table_pk2 not null,
    tel varchar2(20)
);

insert into table_pk (login_id, login_pwd, tel)
values (null, null, null);

insert into table_pk (login_id, login_pwd, tel)
values ('id', null, null);

insert into table_pk (login_id, login_pwd, tel)
values ('id', 'pw', null);
insert into table_pk (login_id, login_pwd, tel)
values ('id', 'pw', null);

insert into table_pk (login_pwd, tel)
values ('pw', null);

create table table_pk3(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20),
    
    primary key (login_id, login_pwd)
);
select * from user_constraints
where table_name = 'TABLE_PK3';

insert into table_pk3
values ('id1', 'pw1', null);
insert into table_pk3
values ('id1', 'pw2', null);
select * from table_pk3;

create table dept_fk (
    deptno1 number primary key,
    dname varchar2(14)
);
-- foreign key, FK, �ܷ�Ű, ����Ű
-- ����� �Ǵ� ���̺��� �÷��� ���� Ÿ������ �����ؾ� �Ѵ�
-- �÷����� ���� �޶� ���� ����(���� ���� �Ѵ�)
-- ����� �Ǵ� �÷��� PK���� �Ѵ�
create table emp_fk (
    empno number primary key,
    ename varchar2(10),
    deptno number references dept_fk(deptno1)
    -- deptno number references dept_fk -- ���� �÷� ���ٸ� �÷��� ���� ����
);
create table emp_fk2 (
    empno number primary key,
    ename varchar2(10),
    deptno number,

    foreign key(deptno) references dept_fk(deptno1)
);
insert into dept_fk
values(100, '1���ǽ�');

insert into emp_fk values(1, '�̸�', 101); -- ���ʿ� �����ϱ� ����
insert into emp_fk values(1, '�̸�', 100);

update emp_fk set deptno = 101;
-- emp_fk���� 100�� �����ϰ��־ ����,���� �Ұ�
update dept_fk set deptno1 = 101;   
delete dept_fk;
truncate table dept_fk;

delete emp_fk;
update dept_fk set deptno1 = 101;   

create table table_default(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20) default '000-0000'
);

insert into table_default
values ('id', 'pw', '010-1233-4567');
insert into table_default (login_id, login_pwd)
values ('id2', 'pw2');
select * from table_default;





