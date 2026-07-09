-- Last updated: 09/07/2026, 15:08:15
# Write your MySQL query statement below
SELECT class FROM courses
GROUP BY 1
HAVING COUNT(student)>=5;