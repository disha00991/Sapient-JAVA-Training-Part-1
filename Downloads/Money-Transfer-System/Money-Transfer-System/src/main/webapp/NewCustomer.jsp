<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MTS</title>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" />
</head>
<body>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="/" class="navbar-brand">
				<p id="heading">
					<b>My Bank Netbanking Portal</b>
				</p>
			</a>
		</div>
	</div>
	</nav>
	<div class="container">
		<div class="page-header">
			<p id="page-heading">New Banker First Time Login</p>
		</div>

		<form action="new-banker" method="post">
			<div class="form-group">
				<label>Your Name</label> <input class="form-control" type="text"
					name="name" />
			</div>
			<div class="form-group">
				<label>A/C No</label> <input class="form-control" type="text"
					name="acNo" />
			</div>
			<div class="form-group">
				<label>Initial Deposit</label> <input class="form-control"
					type="number" name="balance" />
			</div>
			<button class="btn btn-success" type="submit">Get Started!</button>
		</form>
	</div>


</body>
</html>