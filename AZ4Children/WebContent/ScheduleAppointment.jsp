<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Schedule Appointment</h1>
	<form action="scheduleAppointment" method="post">
		        
		<table cellpadding="3pt">
			            
			<tr>
				                
				<td>Kid id</td>                 
				<td><input type="number" name="kidId" /></td>             
			</tr>
			<tr>
				                
				<td>Parent id</td>                 
				<td><input type="text" name="parentId" /></td>             
			</tr>
			            
			<tr>
				                
				<td>Checkin Time</td>                 
				<td><input type="date" name="checkInTime" /></td>
				            
			</tr>
			<tr>
				                
				<td>Checkout Time</td>                 
				<td><input type="date" name="checkOutTime" /></td>
				            
			</tr>
			<tr>
				                
				<td>Number Of People Coming</td>                 
				<td><input type="number" name="numberOfPeopleVisiting" /></td>
				            
			</tr>
			                            
		</table>
		   
		<p />
		        <input type="submit" value="Register" />     
</body>
</html>