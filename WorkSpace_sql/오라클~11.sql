SELECT
    level,
    empno,
    lpad(' ', 2 * level)
    || ename,
    mgr
FROM
    emp
START WITH
    mgr IS NULL -- ������
CONNECT BY
    PRIOR empno = mgr
ORDER SIBLINGS BY
    empno;
select
    *
    from emp_recu er left outer
JOIN emp e ON er.empnoo = e.mgr
where e.mgr is not null -- ������ �����ϴ� ����
)
search depth first by empno desc set sort_empno-desc -- ���Ŀ� ���� ���� �� ��Ī