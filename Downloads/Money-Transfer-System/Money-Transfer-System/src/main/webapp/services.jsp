<!DOCTYPE html>
<%@page import="com.mybank.mts.model.Customer"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MTS</title>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
	<!-- Heading -->
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
		<%
			Customer customer = (Customer) request.getSession().getAttribute("myCustomer");
			String transferMsg = request.getParameter("extraMsg") != null ? request.getParameter("extraMsg") : "";
			String message = "Dear " + customer.getName() + "," + request.getParameter("msg") + transferMsg;
		%>
		<span class="badge"><%=request.getParameter("msg") != null ? message : ""%></span>
		<div class="page-header">
			<p id="page-heading">Services</p>
		</div>

		<div class="list-group" id="services">
			<div class="list-group-item">
				<a href="withdraw">Withdraw</a>
			</div>
			<div class="list-group-item">
				<a href="deposit">Deposit</a>
			</div>
			<div class="list-group-item">
				<a href="transfer">Transfer</a>
			</div>
		</div>
	</div>

</body>
</html>