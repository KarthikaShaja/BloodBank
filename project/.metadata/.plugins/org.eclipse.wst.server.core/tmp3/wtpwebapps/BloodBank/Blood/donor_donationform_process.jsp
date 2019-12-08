<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="blood.dto.*,blood.bl.*,blood.dl.*,blood.utlity.*,java.sql.Date,  java.text.SimpleDateFormat "%>
<%!String donor_id, donor_name, blood_grp, gender, age, dod;

	long phone;
	float height, weight;
	DonorDTO donor = null;
	int result;%>
<%
	try {

		donor_id = (String) session.getAttribute("donorId");
		donor_name = (String) session.getAttribute("donor_name");
		blood_grp = (String) session.getAttribute("blood_grp");
		gender = (String) session.getAttribute("gender");
		age = (String) session.getAttribute("age");
		phone = (Long) session.getAttribute("Phone");
		height = (Float) session.getAttribute("Height");
		weight = (Float) session.getAttribute("Weight");
		dod = request.getParameter("dod");

		System.out.println(donor_id);
		System.out.println(donor_name);
		System.out.println(blood_grp);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(dod);

		donor = new DonorDTO();
		donor.setDonor_id(donor_id);
		donor.setDonor_name(donor_name);
		donor.setBlood_grp(blood_grp);
		donor.setGender(gender);
		donor.setAge(age);
		donor.setPhone(phone);
		donor.setHeight(height);
		donor.setWeight(weight);
		donor.setDod(dod);

		//donor.

		result = AdminAcceptDonorBL.addToAdminAccept(donor);

		if (result > 0) {
			session.setAttribute("message", "Donor details added to Admin successfully");
		} else {
			session.setAttribute("message", "Please try again later");
		}
		response.sendRedirect("welcome_donor.jsp");
	}

	catch (Exception e) {
		System.out.println("**Error**: Donor: donor_donationform_process" + e.getMessage());
		e.printStackTrace();
		response.sendRedirect("donor_add.jsp");
	}
%>
