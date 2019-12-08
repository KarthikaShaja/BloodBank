<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,blood.dto.*,blood.bl.*" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
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

<title>Untitled Document</title>
</head>
<h1>Blood Group Details</h1>
<div style="background-image: url('images/logo2.jpg')">
	<%@ include file="../includes/menu.jsp"%>

	<body>
		<table width="100%" height="688" border="0">
			<tbody>
				<tr>
					<td height="684" align="center" valign="top"><table
							width="100%" border="0">
							<tbody>
								<tr>
									<td height="530" align="center" valign="top"><table
											width="100%" border="0">
											<tbody>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; font-weight: bold; font-size: 250%;">Blood
														Group Details</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509">
														<%
															if (session.getAttribute("message") != null) {
																out.println((String) session.getAttribute("message"));
																session.removeAttribute("message");
															}
														%>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">
														<form id="form1" name="form1" method="post">
															<%
																String blood_grp = request.getParameter("txtBloodGrp");
																System.out.println(blood_grp);
																ArrayList<DonorDTO> grps = DonorBL.getBloodGrps(blood_grp);
																if (grps != null && grps.size() > 0) {
															%>
															<table width="80%" border="1" align="center"
																class="table table-striped"
																style="background-color: white">
																<tbody style="">
																	<tr style="background-color: red">
																		<td width="11%" height="33" align="center"
																			valign="middle" style="color: white"><sapan
																				style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Donor
																			Name</sapan></td>
																		<td width="11%" height="33" align="center"
																			valign="middle" style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Phone</span></td>

																	</tr>
																	<%
																		for (DonorDTO donor : grps) {
																	%>
																	<tr>
																		<td height="30" align="center"><%=donor.getDonor_name()%>&nbsp;</td>
																		<td align="center"><%=donor.getPhone()%>&nbsp;</td>

																	</tr>
																	<%
																		}
																		} else {
																	%>
																	<tr>
																		<td valign="middle" align="center" colspan="7"
																			style="color: red; font-weight: bold;">No Blood
																			Details Found</td>
																	</tr>
																	<%
																		}
																	%>
																</tbody>
															</table>


														</form>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">&nbsp;</td>
												</tr>
											</tbody>
										</table></td>
								</tr>

							</tbody>
						</table></td>
				</tr>
		</table>

		<%@ include file="../Designs/footer.jsp"%>
	</body>
</div>
</html>
