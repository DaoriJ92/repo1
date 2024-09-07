-- 오라클 문법을 사용한 대댓글 조회
select 
    level lv, empno, lpad(' ', 2*level)||ename, mgr
from emp
start with mgr is null -- 시작점
connect by 
    empno != 7788 
    and prior empno = mgr
order siblings by empno desc;

-- 보편적인 문법을 사용한 대댓글 조회
with emp_recu (lv, empno, ename, mgr) as (
    select 
        1 as lv,
        empno, ename, mgr 
    from emp            -- 대상 테이블
    where mgr is null   -- 원글
    
    union all
    
    select
        er.lv + 1 as lv,
        e.empno, lpad(' ', 2*er.lv)||e.ename, e.mgr
    from emp_recu er
    left outer join emp e on er.empno = e.mgr
    where e.mgr is not null -- 원글을 제외하는 조건
)
search depth first by empno desc set sort_empno_desc  -- 정렬에 대한 정의 및 별칭
select * from emp_recu
order by sort_empno_desc; -- 정렬 별칭을 활용


--페이징
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
-- 한번에 3개씩 보여주는데 2번째 페이지
create table emp2
as select * from emp;
insert into emp2
select * from emp2;

select count(*) from emp2;

drop table emp2;
commit;

select * from emp2;