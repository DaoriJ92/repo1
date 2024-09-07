-- �� �� �ּ�
/*
����
�ּ�
*/
SELECT
    *   -- ��� �÷� , �ǹ����� �޸𸮸� ���� ��� �� �� ������� ����.
FROM
    emp;
-- SQL Developer �ڵ� ���� Ű Ctrl + F7
SELECT
    empno, -- ��ȸ�ϰ� ���� �÷� ���
    ename,
    deptno     
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
--�� �� ���� ����Ű : ctrl + shift + d

-- distinct : select ���� �ߺ��Ǵ� �ڷḦ ���� �� �ش�.
select distinct deptno from emp;

select distinct job from emp;

-- �÷��� ���� ���� ��� ������ �ߺ� �Ǵ°� �����Ѵ�.
select distinct deptno,job from emp;

-- null �� ���� �ϸ� �ᱣ���� ������ null �̴�
select ename, sal, sal*12+comm, comm from emp;

-- �÷� �� ��Ī ���
-- "" ���� ����
-- as ���� ����
-- ��Ī �ȿ� ���Ⱑ �ִ� ��� "" ���� �Ұ�
-- ���� �ϸ� ���⺸�� _ �� ����.
select ename, sal, sal*12+comm as "new_SAL", comm from emp;

-- order by : �ش� �÷����� ����
-- ������ �� : asc(ascending)��������
-- ������ �� : desc(descending)
-- ���� ���� �� ��� ������ ���� �� �� ����.

select * from emp
order by sal; -- odrder by ��ü�� Ű ���̴�.

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by  ù��° ��� �Ȱ��� �켱������ ���� �켱 ���� ��
-- �� �� �ش�Ǵ� ��Ҹ� ���� ��� �Ȱ����� ����
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
--where sal != 3000; != �� �����ڵ��� ���� �ڵ��̸� sql ������ <> �� ����Ѵ�. 
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
 
 -- %�� ��ŵ� �������
 -- T% : t�� �����ϴ� �ܾ�, ���̴� ��� ����
 select * from emp
 where ename like 'S%';
 
 select * from emp where ename like 'A%';
 -- _ �� �ѱ���
 select * from emp where ename like '_L%';

 select * from emp where ename like '____';

 select * from emp where ename like '%AM%';

-- null�� ���� ��
-- ������ null�� ����, �� �Ұ�.
 select * from emp where comm <= 400;

-- null �� �������� ���ؼ��� is �� ����� �����´�.
-- �������� is not null �� ����ϸ� null�� �ƴ� ���� �����´�.
 select * from emp where comm is null;
 
 -- emp ���� deptno�� 10 �Ǵ� 20�� ����� empno, ename, sal, deptno�� ���
 select empno, ename, sal, deptno from emp 
-- where deptno = 10 OR deptno = 20;
 where deptno in (10, 20); -- in Ȱ��

-- union
-- ���� �ٸ� ��ȸ ������� ���� ��
-- ��, ��ȸ�� �÷��� ������ Ÿ���� ���ƾ� �Ѵ�.
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union
 
 select deptno, empno, ename, sal from emp
 where deptno = 20; 
 
 -- union �� �ߺ� �ڷḦ ���� �� ��
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union
 
 select deptno, empno, ename, sal from emp
 where deptno = 10;
 
 -- �׷��� ������ �򰥸��� �ʱ� ���Ͽ�
 -- �ߺ� ���� ���� ���� �ʴ� union all �� �ǹ������� ���� ��� �Ѵ�.
 select deptno, empno, ename, sal from emp
 where deptno = 10
  
 union all
 
 select deptno, empno, ename, sal from emp
 where deptno = 10;
 
 -- Q1 emp ���̺��� ename�� s�� ������ ��� �����͸� ��� ��� �ϼ���.
 
 select empno, ename, job, hiredate, sal, comm, deptno from emp
 where ename like '%S';
 
 -- Q2 emp ���̺��� 30�� �μ� ���� �ٹ��ϰ� �ִ� ����߿� 
 -- ��å�� saleman�� ����� �����ȣ �̸� ��å �޿� �μ���ȣ�� ��� �ϼ���
 
 select empno, ename, job, sal, deptno from emp
 where deptno = 30 AND job = 'salesman';
 
 -- Q3 emp ���̺��� 20��, 30�� �μ��� �ٹ��ϰ� �ִ� ��� ��
 -- �޿��� 2000 �ʰ��� ����� ���� �ΰ��� ����� select ���� ����Ͽ�
 -- �����ȣ, �̸�, �޿�, �μ���ȣ�� ����Ͻÿ�
 -- ���� �����ڸ� ������� ���� ���
 -- ���տ����ڸ� ��� �� ���
 
 select empno, ename, job, sal, deptno from emp
 where deptno in (20, 30) AND sal > 2000;
 
(select empno, ename, job, sal, deptno 
 FROM emp 
 where deptno = 20 AND sal > 2000)
UNION
(select empno, ename, job, sal, deptno 
 FROM emp 
 where deptno = 30 AND sal > 2000);
 
 -- Q4 not between �����ڸ� ���� �ʰ�
 -- �޿��� ���� 2000�̻� 3000���� 
 -- ���� �̿��� ���� ���� �����͸� ����Ͻÿ�
 select empno, ename, job, hiredate, sal, comm, deptno from emp
 where not ( sal > 2000 and sal < 3000);
 
 -- Q5 ����̸��� E�� ���ԵǾ� �ִ� 30�� �μ��� ��� ��
 -- �޿��� 1000~2000 ���̰� �ƴ� ����̸�, �����ȣ, �޿�, �μ���ȣ�� ����Ͻÿ�
 select ename, empno, sal, deptno from emp
 where sal not between 1000 AND 2000
 order by empno;
 
 -- Q6 �߰� ������ �������� �ʰ� ����ڰ� �ְ�
 -- ��å�� MANAGER, CLERK�� ��� ��,
 -- ����̸��� �ι�° ���ڰ� L �� �ƴ� ����� ������ ����Ͻÿ�
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
    
    
 -- upper, lower = ��ҹ��� ���� ���� like �Ҷ� �� ����.    
    select * from emp 
    where lower(ename) like lower('%Mi%');
    
    select ename, length(ename)
    from emp;
    
    select * from emp
    where length(ename) >=5;
    
    select length('��'), lengthb('��') from dual;
    
    select job from emp;
    
    -- substr : ����� �Ǵ� ����, ������ġ , ������ ����
    -- ���� �� ������ �Ⱦ��ų� �ʹ� ũ�� ������
    select
        job, 
        substr(job, 1, 2), 
        substr(job, 3, 2), 
        substr(job, 5),
        ename,
        substr(job, -3, 2),
        --length = ���� ����
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
