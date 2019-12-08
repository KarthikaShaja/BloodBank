 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Receiver List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Patient Id</th><th>Patient Name</th><th>Blood Grp</th><th>Gender</th><th>Hospital Name</th><th>Hospital Patient ID</th><th>Contact No:</th></tr>  
   <c:forEach var="receiver" items="${list}">   
   <tr>  
   <td>${receiver.patient_id}</td>  
   <td>${receiver.patient_name}</td>  
   <td>${receiver.blood_grp}</td>  
   <td>${receiver.gender}</td> 
   <td>${receiver.hos_name}</td>   
   <td>${receiver.hos_pat_id}</td>  
   <td>${receiver.phone}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="receiverform">Add New receiver</a>  