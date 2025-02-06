# Write your MySQL query statement below
SELECT Person.firstName,Person.lastName,a.city,a.state
FROM Person
LEFT JOIN Address a ON a.personId = Person.personId;