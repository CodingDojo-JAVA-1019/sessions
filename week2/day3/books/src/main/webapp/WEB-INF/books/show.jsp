<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <!--  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book</title>
</head>
<body>
	<nav>
		<ul>
			<li><a href="/books">Books</a></li>
			<li><a href="/books/new">Create Book</a></li>
		</ul>
	</nav>
	
	<section>
		<h1>${ book.title }</h1>
		<p>Pages: ${ book.pages }</p>
		<p>Publisher: ${ book.publisher }</p>
		<p>Description: ${ book.description }</p>
		
	</section>
</body>
</html>