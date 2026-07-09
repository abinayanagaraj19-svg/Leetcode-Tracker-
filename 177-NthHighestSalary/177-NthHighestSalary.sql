-- Last updated: 09/07/2026, 15:09:39
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;

  RETURN (
    SELECT DISTINCT salary
    FROM EMPLOYEE
    ORDER BY SALARY DESC
    LIMIT 1 OFFSET N
      # Write your MySQL query statement below.

  );
END