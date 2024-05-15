use target;
/*1-5 queries without 2nd one
1.Write a query to display the lastname, department number, and department name
for all employees.
2. Create a unique listing of all jobs that are in department 30. Include the location id in
the output.
3. Write a query to display the employee lastname, department name, location id, and
city of all employees who earn a commission.
4. Display the employee lastname, and department name for all employees who have
an "a" in their lastname.
5. Write a query to display the lastname, job, department number, and department
name for all employees who work in Toronto.*/

1.
select e. LAST_NAME,d.DEPARTMENT_ID , DEPARTMENT_NAME from employees e left join departments d on e.DEPARTMENT_ID=d.DEPARTMENT_ID;
2.
  
3.
select e.last_name ,d.department_name ,l.location_id,l.city from employees e,departments d,locations l where e.department_id=d.department_id and d.location_id=l.location_id and commission_pct is not null;
4.
SELECT e.last_name, d.department_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id
WHERE e.last_name LIKE '%a%';
5.
select  E.last_name ,D.department_id,D.department_name , e.job_id	 
from employees E ,departments D , locations L  
where  (E.department_id = D.department_id ) AND (D.location_id = L.location_id ) 
AND L.city = "Toronto";  
