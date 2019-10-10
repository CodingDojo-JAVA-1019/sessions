<%@ page isErrorPage="true" %>   
<!--  -->
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
<title>Edit Book</title>
</head>
<body>

	<nav>
		<ul>
			<li><a href="/books">Books</a></li>
			<li><a href="/books/new">Create Book</a></li>
		</ul>
	</nav>
		<section>
			<fieldset>
				<legend>Edit Book</legend>
				
				
				<form:form action="/books/${ book.id }" method="POST" modelAttribute="book" autocomplete="off">
					<input type="hidden" name="_method" value="put">
					<form:hidden path="id" />
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
				    <input type="submit" value="Submit"/>
				</form:form>    
			</fieldset>
		</section>
</body>
</html>