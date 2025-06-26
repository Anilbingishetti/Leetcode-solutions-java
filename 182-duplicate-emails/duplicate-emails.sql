# Write your MySQL query statement below
select p1.email as Email
from person p1
Group by p1.email
having  count(*) > 1;