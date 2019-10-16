<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<title>Author</title>
</head>
<body class='container'>
<main>
	<nav class='navbar navbar-expand-xl'>
		<ul class='navbar-nav'>
			<li class='navbar-item'><a href="/authors" class='navbar-link'>Authors</a></li>
			<li class='navbar-item'><a href="/authors/new" class='navbar-link'>Create Author</a></li>
			<li class='navbar-item'><a href="/books" class='navbar-link'>Books</a></li>
			<li class='navbar-item'><a href="/books/new" class='navbar-link'>Create Book</a></li>
		</ul>
	</nav>
	
	<h1>Profile for ${ author.name }</h1>
	
	<section>
		<h3>Bio</h3>
		
		<p>Name: ${ author.name }</p>
		<p>Age: ${ author.age }</p>
		
		<section>
			<h4>Books</h4>
			
			<c:choose>
				<c:when test="${ author.books.size() > 0 }">
				<!--  render html here -->
				
				<table class='table table-striped'>
					<thead>
						<tr>
							<th>Title</th>
							<th>Pages</th>
							<th>Publisher</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach var='book' items='${ author.books }'>
							<tr>
								<td><a href='/books/${ book.id }'>${ book.title }</a></td>
								<td>${ book.pages }</td>
								<td>${ book.publisher }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</c:when>
				
				<c:otherwise>
					<p>No books added for this author yet!</p>
				</c:otherwise>
			</c:choose>
		</section>
	</section>
</main>
</body>
</html>