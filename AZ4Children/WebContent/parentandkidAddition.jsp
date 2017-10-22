<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
	    
	<h1>Parent and Kid Addition</h1>
	    
	<form action="parentkidAddition" method="post">
		        
		<table cellpadding="3pt">
			 <tr>
				                
				<td>Parent First Name :</td>                 
				<td><input type="text" name="ParentFirstName" /></td>             
			</tr>
			<tr>
				                
				<td>Parent Last Name :</td>                 
				<td><input type="text" name="ParentLastName" /></td>             
			</tr>           
			<tr>
				                
				<td>Kid First Name :</td>                 
				<td><input type="text" name="KidFirstName" /></td>             
			</tr>
			<tr>
				                
				<td>Kid Last Name :</td>                 
				<td><input type="text" name="KidLastName" /></td>             
			</tr>
			            
			<!-- <tr>
				                
				<td>Parent ID</td>                 
				<td><input type="number" name="parentId" /></td>             
			</tr> -->
			<tr>
				                
				<td>Gender</td>                 
				<td><input type="text" name="gender" /></td>             
			</tr>
			              
			<tr>
				                
				<td>Date of birth</td>                 
				<td><input type="date" name="dob" /></td>             
			</tr>
			            
			<tr>
				                
				<td>email :</td>                 
				<td><input type="text" name="email" /></td>             
			</tr>
			                     
		</table>
		        
		<p />
		        <input type="submit" value="Register" />
		<a href="LogoutServlet">Logout</a>
									  
	</form>
</body>
</html>