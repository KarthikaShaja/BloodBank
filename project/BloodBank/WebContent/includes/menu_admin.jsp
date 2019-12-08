<!DOCTYPE html>
<html>
<head>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: blue;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not (.active ) {
	background-color: red;
}

.active {
	background-color: blue;
	orange
}
</style>
</head>
<body>


	<ul>
		<li><a href="../Designs/index.jsp">Home</a></li>
		<li><a href="../admin/admin_view_donor.jsp">Donor Request</a></li>
		<li><a href="../admin/admin_view_receiver.jsp">Receiver
				Request</a></li>
		<li><a href="../admin/onetimeDonation.jsp">ADD Donor</a></li>
		<li><a href="../admin/admin_view_all_donor.jsp">Donor Details</a></li>
		<li><a href="../admin/admin_view_all_receiver.jsp">Receiver
				Details</a></li>
		<li><a href="../admin/blood_stock_view.jsp">Stock Details</a></li>
		<li><a href="../login/adminlogout.jsp">Log Out</a></li>

	</ul>

</body>
</html>