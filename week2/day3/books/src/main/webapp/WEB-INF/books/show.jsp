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
	<nav class='navbar navbar-expand-xl'>
		<ul class='navbar-nav'>
			<li class='navbar-item'><a href="/authors" class='navbar-link'>Authors</a></li>
			<li class='navbar-item'><a href="/authors/new" class='navbar-link'>Create Author</a></li>
			<li class='navbar-item'><a href="/books" class='navbar-link'>Books</a></li>
			<li class='navbar-item'><a href="/books/new" class='navbar-link'>Create Book</a></li>
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