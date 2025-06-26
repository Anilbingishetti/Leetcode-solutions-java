# Write your MySQL query statement below
Select e1.name As Employee
From Employee e1
Join Employee e2
on e1.managerId = e2.id
Where e1.salary > e2.salary;