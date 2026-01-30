SELECT E1.name,E2.bonus FROM Employee E1 LEFT JOIN Bonus E2 on E1.empId=E2.empId WHERE E2.Bonus<1000 or E2.bonus is NULL;
