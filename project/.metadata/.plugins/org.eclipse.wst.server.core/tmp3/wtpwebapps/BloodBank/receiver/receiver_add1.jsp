<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px so
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}


input[type=date]{
  width: 100%;
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!DOCTYPE html>

<h1>Donor Details</h1>
<%@ include file = "../includes/menu.jsp" %>
<div class="container">
  <form:form action="save" method ="POST" >

    Patient Name:
    <form:input path ="patient_name" placeholder="Your name.."/>

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
     </form:select>
    
    Gender :
           <form:radiobutton path = "gender" value = "Male" />Male
           <form:radiobutton path = "gender"  value ="Female"/>Female<br><br>

     Hospital Name:
    <form:input path ="hos_name" placeholder="Your hospital name.."/>
  
    Hospital Patient ID:
    <form:input path ="hos_pat_id" placeholder="Your hospital id.."/>
   
     Contact No:
    <form:input path = "phone" placeholder = "Your contact no is.."/>
    <input type="submit" value="Register">
  
    </form:form>  
   

    

</div>

</body>
</html>
