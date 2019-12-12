<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to two.jsp page</h1> <hr/>

   <table border="1">
   	<tr>
   		<th>Product Id</th>
   		<th>Product Name</th>
   		<th>Price</th>
   	</tr>
   	
   <c:forEach  var="product" items="${products }">
   	<tr>
   		<td>${product.productId }</td>
   		<th>${product.productName }</th>
   		<th>${product.price }</th>
   	</tr>
   </c:forEach>
   
   	
   </table>



</body>
</html>