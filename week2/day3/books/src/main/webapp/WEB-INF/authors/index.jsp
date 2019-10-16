<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <!--  -->
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authors</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
</head>
<body class='container'>
	<nav class='navbar navbar-expand-xl'>
		<ul class='navbar-nav'>
			<li class='navbar-item'><a href="/authors" class='navbar-link'>Authors</a></li>
			<li class='navbar-item'><a href="/authors/new" class='navbar-link'>Create Author</a></li>
			<li class='navbar-item'><a href="/books" class='navbar-link'>Books</a></li>
			<li class='navbar-item'><a href="/books/new" class='navbar-link'>Create Book</a></li>
		</ul>
	</nav>
	<main>
		<h1>Authors</h1>
		
		<section>
			<table class='table table-striped'>
				<thead>
					<tr>
						<th>Name</th>
						<th>Age</th>
						<th>Books Count</th>
						<th>Actions</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach var="author" items="${ authors }">
						<tr>
							<td><a href="/authors/${ author.id }">${ author.name }</a></td>
							<td>${ author.age }</td>
							<td>${ author.books.size() }</td>
							<td>Future Actions</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>
	</main>
</body>
</html>