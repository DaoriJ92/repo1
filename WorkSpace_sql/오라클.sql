-- 한 줄 주석
/*
범위
주석
*/
SELECT
    *   -- 모든 컬럼 , 실무에선 메모리를 많이 사용 해 잘 사용하지 않음.
FROM
    emp;
-- SQL Developer 자동 정렬 키 Ctrl + F7
SELECT
    empno, -- 조회하고 싶은 컬럼 명들
    ename,
    deptno     
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
--한 줄 복사 단축키 : ctrl + shift + d

-- distinct : select 에서 중복되는 자료를 제거 해 준다.
select distinct deptno from emp;

select distinct job from emp;

-- 컬럼이 여러 개인 경우 조합이 중복 되는걸 제거한다.
select distinct deptno,job from emp;

-- null 과 연산 하면 결괏값은 무조건 null 이다
select ename, sal, sal*12+comm, comm from emp;

-- 컬럼 명에 별칭 사용
-- "" 생략 가능
-- as 생략 가능
-- 별칭 안에 띄어쓰기가 있는 경우 "" 생략 불가
-- 가능 하면 띄어쓰기보다 _ 를 넣자.
select ename, sal, sal*12+comm as "new_SAL", comm from emp;

-- order by : 해당 컬럼으로 정렬
-- 오름차 순 : asc(ascending)생략가능
-- 내림차 순 : desc(descending)
-- 값이 동일 할 경우 순서를 보장 할 수 없음.

select * from emp
order by sal; -- odrder by 전체가 키 명이다.

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by  첫번째 사용 된것이 우선순위를 가져 우선 정렬 후
-- 그 중 해당되는 요소를 다음 사용 된것으로 정렬
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
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal < 3000
order by sal;

select * from emp
--where sal != 3000; != 는 개발자들이 쓰는 코드이며 sql 에서는 <> 를 사용한다. 
where sal <> 3000;

--select * from emp
--where sal < 2000 or sal >= 3000;
select * from emp
where not (sal >= 2000 and sal < 3000);

select *
 from emp
 where job in ('MANAGER', 'SALESMAN', 'CLERK')
 order by empno ;
 
 select *
 from emp
 where job not in ('MANAGER', 'SALESMAN', 'CLERK')
 order by empno ;
 
 select *
 from emp
 where sal between 2000 and 3000 ;
 
 -- %는 어떤거든 관계없음
 -- T% : t로 시작하는 단어, 길이는 상관 없음
 select * from emp
 where ename like 'S%';
 
 select * from emp where ename like 'A%';
 -- _ 는 한글자
 select * from emp where ename like '_L%';

 select * from emp where ename like '____';

 select * from emp where ename like '%AM%';

-- null이 제외 됨
-- 이유는 null은 연산, 비교 불가.
 select * from emp where comm <= 400;

-- null 을 가져오기 위해서는 is 를 사용해 가져온다.
-- 응용으로 is not null 을 사용하면 null이 아닌 값을 가져온다.
 select * from emp where comm is null;
 
 -- emp 에서 deptno가 10 또는 20인 사원의 empno, ename, sal, deptno를 출력
 select empno, ename, sal, deptno from emp 
-- where deptno = 10 OR deptno = 20;
 where deptno in (10, 20); -- in 활용

-- union
-- 서로 다른 조회 결과물을 합쳐 줌
-- 단, 조회한 컬럼의 갯수와 타입이 같아야 한다.
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union
 
 select deptno, empno, ename, sal from emp
 where deptno = 20; 
 
 -- union 은 중복 자료를 제거 해 줌
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union
 
 select deptno, empno, ename, sal from emp
 where deptno = 10;
 
 -- 그렇기 때문에 헷갈리지 않기 위하여
 -- 중복 값을 제거 하지 않는 union all 을 실무에서는 많이 사용 한다.
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union all
 
 select deptno, empno, ename, sal from emp
 where deptno = 10;
 
 -- Q1 emp 테이블에서 ename이 s로 끝나는 사원 데이터를 모두 출력 하세요.
 
 select empno, ename, job, hiredate, sal, comm, deptno from emp
 where ename like '%S';
 
 -- Q2 emp 테이블에서 30번 부서 에서 근무하고 있는 사원중에 
 -- 직책이 saleman인 사원의 사원번호 이름 직책 급여 부서번호를 출력 하세요
 
 select empno, ename, job, sal, deptno from emp
 where deptno = 30 AND job = 'salesman';
 
 -- Q3 emp 테이블에서 20번, 30번 부서에 근무하고 있는 사원 중
 -- 급여가 2000 초과인 사원을 다음 두가지 방식의 select 문을 사용하여
 -- 사원번호, 이름, 급여, 부서번호를 출력하시오
 -- 집합 연산자를 사용하지 않은 방식
 -- 집합연산자를 사용 한 방식
 
 select empno, ename, job, sal, deptno from emp
 where deptno in (20, 30) AND sal > 2000;
 
(select empno, ename, job, sal, deptno 
 FROM emp 
 where deptno = 20 AND sal > 2000)
UNION
(select empno, ename, job, sal, deptno 
 FROM emp 
 where deptno = 30 AND sal > 2000);
 
 -- Q4 not between 연산자를 쓰지 않고
 -- 급여열 값이 2000이상 3000이하 
 -- 범위 이외의 값을 가진 데이터만 출력하시오
 select empno, ename, job, hiredate, sal, comm, deptno from emp
 where not ( sal > 2000 and sal < 3000);
 
 -- Q5 사원이름에 E가 포함되어 있는 30번 부서의 사원 중
 -- 급여가 1000~2000 사이가 아닌 사원이름, 사원번호, 급여, 부서번호를 출력하시오
 select ename, empno, sal, deptno from emp
 where sal not between 1000 AND 2000
 order by empno;
 
 -- Q6 추가 수당이 존재하지 않고 상급자가 있고
 -- 직책이 MANAGER, CLERK인 사원 중,
 -- 사원이름의 두번째 글자가 L 이 아닌 사원의 정보를 출력하시오
 SELECT
    *
FROM
    emp
WHERE
    comm IS NULL
    AND mgr IS NOT NULL
    AND ename NOT LIKE '_L%'
    AND job IN ( 'MANAGER', 'CLERK' )
ORDER BY
    job;
    
    select ename, upper(ename), lower(ename), initcap(ename)
    from emp;
    
    
 -- upper, lower = 대소문자 구분 없이 like 할때 딱 좋다.    
    select * from emp 
    where lower(ename) like lower('%Mi%');
    
    select ename, length(ename)
    from emp;
    
    select * from emp
    where length(ename) >=5;
    
    select length('한'), lengthb('한') from dual;
    
    select job from emp;
    
    -- substr : 대상이 되는 문자, 시작위치 , 가져올 갯수
    -- 가져 올 갯수를 안쓰거나 너무 크면 끝까지
    select
        job, 
        substr(job, 1, 2), 
        substr(job, 3, 2), 
        substr(job, 5),
        ename,
        substr(job, -3, 2),
        --length = 문자 갯수
        length( lower(substr( job, 5, 100 ) ) )
    from emp;
    
    select
        job,
        length(job),
        length(job) / 2,
        substr(job, (length(job)+1) / 2, 1),
        replace(
        job,
        substr(job, (length(job)+1) / 2, 1),
        '*'
        )
    from emp;
    
    create table emp0
    as select * from emp;
    select * from emp0;
    
    SELECT * FROM equipment WHERE equiID = 'equi002';
