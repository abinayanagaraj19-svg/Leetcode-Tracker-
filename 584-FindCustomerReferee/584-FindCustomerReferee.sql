-- Last updated: 09/07/2026, 15:08:21
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2
OR referee_id IS NULL;