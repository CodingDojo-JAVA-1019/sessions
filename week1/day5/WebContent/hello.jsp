<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  -->
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>

<!-- <script src="main.js"></script> -->
<link href="styles.css" rel="stylesheet" />
</head>
<body>
	<h1>Hello Web!!</h1>
	
<%! 
public int add(int a, int b) {
	return a + b;
}
%>

<%
int i = 1234534;
int j = 234;
%>

<h3><%= add(i, j) %></h3>


<section>

	<h1><c:out value="${name}" /></h1>
	
	
	<ul>
		<c:forEach var="person" items="${ people }">
			<li> <c:out value="${person }" /> </li>
		</c:forEach>
	</ul>
	
</section>

</body>
</html>