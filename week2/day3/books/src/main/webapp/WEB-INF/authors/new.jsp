<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!--  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Author</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
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
		<fieldset>
			<legend>Create Author</legend>
			
			
			<form:form
				action="/authors"
				method="POST"
				modelAttribute="author"
				autocomplete="off"
			>
			
				<div>
					<form:label path="name">Name</form:label>
					<form:input path="name" required="true" />
					<form:errors path="name" />
				</div>
				
				<div>
					<form:label path="age">Age</form:label>
					<form:input path="age" type="number" required="true" />
					<form:errors path="age" />
				</div>
			
				<button>Create</button>
			</form:form>
			
		</fieldset>
	</main>
</body>
</html>