# Write your MySQL query statement below
Select c.name as Customers from Customers as c Left Join Orders as O On c.id = O.customerId where o.customerId is null;