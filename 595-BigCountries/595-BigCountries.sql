-- Last updated: 09/07/2026, 15:08:16
# Write your MySQL query statement below
select name,population,area
from world
WHERE area >= 3000000
   OR population >= 25000000;