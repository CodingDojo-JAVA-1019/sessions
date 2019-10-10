<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
	<nav>
		<ul>
			<li><a href="/books">Books</a></li>
			<li><a href="/books/new">Create Book</a></li>
		</ul>
	</nav>

	<h1>Books</h1>
	<p>${error }</p>
	<section>
	
		<table>
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
						<td>Eventual Author</td>
						<td><a href="/books/${ book.id }/edit">Edit Book</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
</html>