<%@page import="com.mvcQ5.EmployeeDataBase"%>
<%@ page import="java.sql.*" %>

<html>
<body>
<%	EmployeeDataBase emp= new EmployeeDataBase();
	 ResultSet resultset= emp.getDetailById(request.getAttribute("userId").toString());	
	%>
	<form action="/updateEmployee.html" method="post">
	 <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Department</TH>
                <TH>Designation</TH>
                <TH>Salary</TH>
               
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD><input type="text" value="<%= resultset.getInt(1) %>" name="employeeId"   /></td>
                <TD><input type="text" value=" <%= resultset.getString(2) %>" name="employeeName"/></TD>
                <TD><input type="text" value=" <%= resultset.getString(3) %>" name="employeeDepartment"/></TD>
                <TD> <input type="text" value="<%= resultset.getString(4) %>" name="employeeDesignation"/></TD>
                <TD> <input type="text" value="<%= resultset.getInt(5) %>" name="employeeSalary"/></TD>
                
            </TR>
            <% } %>
            
        </TABLE>
        <p> 
             <input type="submit" value="Update"/>
            </p>
        </form>
</body>
	
</html>