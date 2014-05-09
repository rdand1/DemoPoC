<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.psl.main.InventoryDAO"%>
<%@ page import="com.psl.main.InventoryBean"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Details</title>
</head>

<body>
	<%
		//InventoryDAO  IB = new InventoryDAO(); //not recommended.Pass this object from servlet
		ArrayList list = InventoryDAO.InvLogic();
	%>

	<div class="login">
		<form>
			<h1>CAR INVENTORY</h1>
			<table style="width: 300px" border="1">
				<tr>
					<th><h2>Manufacturer</h2></th>
					<th><h4>Car Name</h4></th>
					<th><h4>Colors available</h4></th>
					<th><h4>Price(INR)</h4></th>
				</tr>

				<%
					for (int i = 0; i < list.size(); i++) {
						InventoryBean bean = (InventoryBean) list.get(i);
				%>
				<tr>
					<td>
						<%
							out.println(bean.getManufacturer());
						%>
					</td>
					<td>
						<%
							out.println(bean.getCarName());
						%>
					</td>
					<td>
						<%
							out.println(bean.getColorsAvailable());
						%>
					</td>
					<td>
						<%
							out.println(bean.getPrice());
						%>
					</td>
				</tr>

				<%
					}
				%>

			</table>

		</form>
	</div>
</body>
</html>