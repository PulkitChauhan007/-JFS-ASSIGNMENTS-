<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<form action="/InsertEmployee.html" method="post">
	 	<table>
	 		<tr>
	 		<td>Employee Name :</td> <td> <input type="text" name="employeeName"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Department  :</td> <td> <input type="text" name="employeeDepartment"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Designation :</td> <td> <input type="text" name="employeeDesignation"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Salary :</td> <td> <input type="text" name="employeeSalary"/></td>
	 		</tr>
	 		<tr>
	 		<td> <input type="submit" name="Add"/></td>
	 		</tr>
	 		
	 	</table>
	
	</form>
</body>
</html>