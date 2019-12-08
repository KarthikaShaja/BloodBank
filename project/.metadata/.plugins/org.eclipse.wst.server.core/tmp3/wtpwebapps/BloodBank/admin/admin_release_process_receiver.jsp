<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="blood.dto.*, blood.bl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!String patient_id,blood_grp;
	ReceiverDTO receiver1;
	int result, status,a;%>

	<%
		//patient_id = request.getParameter("patient_id");
		//receiver1 = ReceiverBL.getReceiver(patient_id);
		//result = AdminReleaseReceiverBL.addToAdminRelease(receiver1);
		//status = ReceiverBL.deleteReceiver(patient_id);
		blood_grp = request.getParameter("blood_grp");
		System.out.println(blood_grp);
		a = BloodStockBL.getCountt(blood_grp);

		if (result > 0) {
			session.setAttribute("success", "Receiver has received the blood....");
			response.sendRedirect("admin_view_all_receiver.jsp");
		} else {
			session.setAttribute("success", "Failed!!!");

		}
	%>

</body>
</html>