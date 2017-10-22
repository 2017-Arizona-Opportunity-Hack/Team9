<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>Arizona Foster Child Charity</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="schedule.css" rel="stylesheet">
	<link href="login.css" rel="stylesheet">
	</head>
	
	<body>
	<ul class="unselectable">
		<li><a href="ScheduleAppointment.jsp">Schedule Appointment</a></li>
		<li><a href="adminView.html">View Appointment</a></li>
		<li><a href="parentandkidAddition.jsp">Add Parent</a></li>
		<li><a class="active">Register User</a></li>
		<li style="float:right"><a href="login.html">Logout</a></li>
	</ul>
	<div style="margin-top:60px">
			<div class="col-md-4 col-md-offset-4 text-center">
				<div class="title">
					<h2 class="unselectable">Register A User</h2>
				</div>
				<form action="register" method="POST" class="loginForm">
					<div class="input-group">
						<input type="text" name="userName" size="30" id="name" class="form-control" placeholder="User Name">
						<input type="text" name="password1" size="30" id="name" class="form-control" placeholder="Password">
						<input type="text" name="password2" size="30" id="name" class="form-control" placeholder="Confirm Password">
						<input type="text" name="email" size="30" id="name" class="form-control" placeholder="Email">
						<input type="text" name="phone" size="30" id="name" class="form-control" placeholder="Phone">
						<input type="date" name="city" size="30" id="name" class="form-control" placeholder="City">
						<input type="text" name="role" size="30" id="name" class="form-control" placeholder="Role (Parent, Admin, or Parent Aide)">


						<a href="schedule.html"><input type="submit" id="submit" class="form-control" value="Submit"></a>
					</div>
				</form>
			</div>
		</div>		
	</body>
</html>