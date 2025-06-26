# Write your MySQL query statement below
select c1.name as Customers
from customers c1
left JOIN orders o1
on c1.id = o1.customerid
where o1.customerid is null