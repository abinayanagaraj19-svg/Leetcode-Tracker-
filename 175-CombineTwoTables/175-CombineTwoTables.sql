-- Last updated: 09/07/2026, 15:09:42
# Write your MySQL query statement belSELECT 
SELECT Person.firstName,Person.lastName,Address.city,Address.state FROM Person
LEFT JOIN Address
ON Person.personId=Address.personId;