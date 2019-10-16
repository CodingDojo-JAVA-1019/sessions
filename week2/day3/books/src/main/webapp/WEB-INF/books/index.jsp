<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
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
	<h1>Books</h1>
	<p>${error }</p>
	<section>
	
		<table class='table table-striped'>
			<thead>
				<tr>
					<th>Title</th>
					<th>Pages</th>
					<th>Author</th>
					<th>Actions</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="book" items="${ books }">
					<tr>
						<td><a href="/books/${ book.id }">${ book.title }</a></td>
						<td> ${ book.pages }</td>
						<td><a href='/authors/${ book.author.id }'>${ book.author.name }</a></td>
						<td>
							<a href="/books/${ book.id }/edit">Edit Book</a>
							<form action='/books/${ book.id }' method='post'>
								<input type='hidden' name='_method' value='delete'>
								<button>Delete Book</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
</html>