<!DOCTYPE html>
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
		<div class="page-header">
			<p id="page-heading">Existing User Login</p>
		</div>
		<form action="existing-banker" method="post">
			<div class="form-group">
				<label>Your Name</label> <input class="form-control" type="text"
					name="name" />
			</div>
			<div class="form-group">
				<label>A/C No</label> <input class="form-control" type="text"
					name="acNo" />
			</div>
			<button class="btn btn-success" type="submit">Login</button>
		</form>
		<hr/>
		<p>First time User? <a href="new-banker-login"><span class="badge">Login here</span></a></p>
	</div>

</body>
</html>