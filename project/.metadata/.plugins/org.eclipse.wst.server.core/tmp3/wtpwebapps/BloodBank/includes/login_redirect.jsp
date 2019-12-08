<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../Designs/css/bootstrap.min.css">

<!-- Swiper CSS -->
<link rel="stylesheet" href="../Designs/css/swiper.min.css">

<link rel="stylesheet" type="text/css"
	href="../Designs/https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Styles -->
<link rel="stylesheet" href="../Designs/style.css">
<title>Login</title>
</head>
<body>
<body class="single-page elements-page">
	<header class="site-header">
	<div class="nav-bar">
		<div class="container">
			<div class="row">
				<div
					class="col-12 d-flex flex-wrap justify-content-between align-items-center">
					<div class="site-branding d-flex align-items-center">
						<a class="d-block" href="index.html" rel="home"><img
							class="d-block" src="images/logo.png" alt="logo"></a>
					</div>
					<!-- .site-branding -->

					<nav
						class="site-navigation d-flex justify-content-end align-items-center">
					<ul
						class="d-flex flex-column flex-lg-row justify-content-lg-end align-items-center">

						<li><a href="../Designs/index.jsp">Home</a></li>
						<li><a href="../Blood/donor_add.jsp">Donor Register</a></li>
						<li><a href="../Blood/receiver_add.jsp">Receiver Register</a></li>
						<li><a href="../Blood/donor_view_all.jsp">View Donor</a></li>
						<li><a href="../Blood/receiver_view_all.jsp">View
								Receiver</a></li>

						<li class="call-btn button gradient-bg mt-3 mt-md-0"><a
							class="d-flex justify-content-center align-items-center" href="#"><img
								src="images/emergency-call.png"> +91 773 636 7984</a></li>
					</ul>
					</nav>
					<!-- .site-navigation -->

					<div class="hamburger-menu d-lg-none">
						<span></span> <span></span> <span></span> <span></span>
					</div>
					<!-- .hamburger-menu -->
				</div>
				<!-- .col -->
			</div>
			<!-- .row -->
		</div>
		<!-- .container -->
	</div>
	<!-- .nav-bar -->

	<div class="container">
		<div class="row">
			<div class="col-12">
				<h1>LOGIN</h1>

				</ul>
			</div>
			<!-- .breadcrumbs -->
		</div>
	</div>
	</div>

	<img class="header-img" src="images/elements-bg.png" alt=""> </header>
	<!-- .site-header -->

	<div class="container">
		<div class="row elements-wrap">
			<div class="col-12">
				<header class="entry-header elements-heading">
				<h2 class="entry-title">Buttons</h2>
				</header>

				<div class="entry-content elements-container">
					<a href="../authentication/direct_donor_login.jsp"
						class="button gradient-bg">User Login</a> <a
						href="../login/adminlogin.jsp" class="button dark">Admin Login</a>
				</div>
			</div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<%@ include file="../Designs/footer.jsp"%>
</body>
</html>