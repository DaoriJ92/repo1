SELECT
    level,
    empno,
    lpad(' ', 2 * level)
    || ename,
    mgr
FROM
    emp
START WITH
    mgr IS NULL -- 시작점
CONNECT BY
    PRIOR empno = mgr
ORDER SIBLINGS BY
    empno;
select
    *
    from emp_recu er left outer
JOIN emp e ON er.empnoo = e.mgr
where e.mgr is not null -- 원글을 제외하는 조건
)
search depth first by empno desc set sort_empno-desc -- 정렬에 대한 정의 및 별칭