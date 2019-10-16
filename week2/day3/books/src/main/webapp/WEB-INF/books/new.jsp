<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  -->
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
  <!--  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<title>Create Book</title>
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
		<section>
			<fieldset>
				<legend>Create Book</legend>
				
				
				<form:form action="/books" method="POST" modelAttribute="book" autocomplete="off">
				    <div>
				        <form:label path="title">Title</form:label>
				        <form:input path="title"/>
				        <form:errors path="title"/>
				    </div>
				    <div>
				        <form:label path="description">Description</form:label>
				        <form:errors path="description"/>
				        <form:textarea path="description"/>
				    </div>
				    <div>
				        <form:label path="publisher">Publisher</form:label>
				        <form:errors path="publisher"/>
				        <form:input path="publisher"/>
				    </div>
				    <div>
				        <form:label path="pages">Pages</form:label>
				        <form:errors path="pages"/>     
				        <form:input type="number" path="pages"/>
				    </div>
				    
				    <div class='form-group'>
				    	<form:label path='author'>Author</form:label>
 					    <form:errors path="author"/>   
 					    <form:select path='author' required='true' class='form-control'>
 					    	<form:option value='-' selected='true' disabled='true' label='Select an author'/>
 					    	
 					    	<form:options items='${ authors }' itemValue='id' itemLabel='name'/>
 					    </form:select>  
				    </div>
				    <input type="submit" value="Submit"/>
				</form:form>    
			</fieldset>
		</section>
	</main>
</body>
</html>