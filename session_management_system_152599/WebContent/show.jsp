<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ include file = "header.jsp" %> 


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Home Page</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>

<body class="text-center">
	<div class="card-3">


		<h1 class="h3 mb-3 font-weight-normal main-heading">Invoice Bill</h1>
		<table class="table">
			<tr>
			 <th class="trow">ID</th>
			
				<th class="trow">Discount</th>
			   <th class="trow"> Discount_Price</th>
			   	<th class="trow">Name</th>
			   	<th class="trow">Price</th>
			   
			
			</tr>
			<c:forEach items="${sessiondata}" var="session">
			<tr>
							<td class="trow">${session.id}</td>
			
				<td class="trow">${session.discount}</td>
				<td class="trow">${session.discount_price*session.price*(100-session.discount)/100}</td>
				
			    <td class="trow">${session.name}</td>
			    <td class="trow">${session.price}</td>
			    
			    
			    
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>