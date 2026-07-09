-- Last updated: 09/07/2026, 15:09:33
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;