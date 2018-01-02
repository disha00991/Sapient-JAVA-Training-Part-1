<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.mybank.mts.model.Customer"%>
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
			<p id="page-heading">Enter Details</p>
		</div>
		<%
			Customer customer = (Customer)request.getSession().getAttribute("myCustomer");
			String path = (String) request.getAttribute("path");
			String action = "Enter " + path + " amount";
		%>
		<form action="<%=path%>" method="post">
			<div class="form-group">
				<label>Your Name</label> <input readOnly="readonly"
					class="form-control" type="text" value="<%=customer.getName()%>"
					name="name" />
			</div>
			<div class="form-group">
				<label>A/C No</label> <input readOnly="readonly"
					class="form-control" type="text" value="<%=customer.getAcNo()%>"
					name="acNo" />
			</div>
			<%
				if (path.equals("transfer")) {
			%>
			<div class="form-group">
				<label>Receiver's A/C No</label> <input class="form-control" type="text"
					name="racNo" />
			</div>
			<%
				}
			%>
			<div class="form-group">
				<label><%=action%></label> <input class="form-control"
					type="number" name="amount" />
			</div>
			<button class="btn btn-danger" type="submit">Confirm
				Transaction</button>
		</form>
	</div>


</body>
</html>