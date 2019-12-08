<!DOCTYPE html>
<html>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<head>
<title>Receiver Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../Designs/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Swiper CSS -->
<link rel="stylesheet" href="../Designs/css/swiper.min.css">

<!-- Styles -->
<link rel="stylesheet" href="style.css">
<script src="js/custom.js"></script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 50%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=date] {
	width: 25%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

	<h1>Receiver Details</h1>
	<div style="background-image: url('images/logo2.jpg')">
		<%@ include file="../includes/menu.jsp"%>

		<div class="container">
			<form:form action="save" method ="POST" >
   
       Patient ID:
    <form:input path ="patient_id" value = "${generatePatientId}" readonly="true"/><br><br>
    Patient Name:
    <form:input path ="patient_name" placeholder="Your name.."/><br><br>

     Blood Group
     <form:select path ="blood_grp" >
     <form:option value = "O-ve"/>O-ve
     <form:option value = "O+ve"/>O+ve
     <form:option value = "A-ve"/>A-ve
     <form:option value = "A+ve"/>A+ve
     <form:option value = "B-ve"/>B-ve
     <form:option value = "B+ve"/>B+ve
     <form:option value = "AB-ve"/>AB-ve
     <form:option value = "AB+ve"/>AB+ve
     </form:select><br><br>
    
    Gender :
           <form:radiobutton path = "gender" value = "Male" />Male
           <form:radiobutton path = "gender"  value ="Female"/>Female<br><br>

     Hospital Name:
    <form:input path ="hos_name" placeholder="Your hospital name.."/><br><br>
  
    Hospital Patient ID:
    <form:input path ="hos_pat_id" placeholder="Your hospital id.."/><br><br>
   
     Contact No:
    <form:input path = "phone" placeholder = "Your contact no is.."/><br><br>
    <input type="submit" value="Register">
  
    </form:form>  
  
		</div>
	</div>
</body>
<%@ include file="../Designs/footer.jsp"%>
</html>
