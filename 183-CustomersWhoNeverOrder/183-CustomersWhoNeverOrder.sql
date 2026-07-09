-- Last updated: 09/07/2026, 15:09:31
# Write your MySQL query statement below
select name as customers 
from customers
where id not in(
    select customerid 
    from orders
);