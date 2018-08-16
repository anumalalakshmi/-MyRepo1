<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--    <%@ include file = "header.jsp" %> 
 --%>   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<table border="1px">
<tr>
<th>P_id</th>
<th>coupon_id</th>
<th>m_id</th>
<th>p_companyname</th>
<th>p_dateofmanufacturing</th>
<th>p_name</th>
<th>p_price</th>
<th>p_type</th>
<th>quantity</th>



</tr>

<a:forEach items="${product}" var="prod">
<tr>
<td>${prod.p_id}</td>
<td>${prod.coupon_id}</td>
<td>${prod.m_id}</td>
<td>${prod.p_companyname}</td>
<td>${prod.p_dateofmanufacturing}</td>
<td>${prod.p_name}</td>
<td>${prod.p_price}</td>
<td>${prod.p_type}</td>
<td>${prod.quantity}</td>


</tr>
</a:forEach>
</table>

</body>
</html>