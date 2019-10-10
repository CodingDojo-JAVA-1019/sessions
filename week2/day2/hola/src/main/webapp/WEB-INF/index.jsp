<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  -->
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Hello From Spring</h1>
	
	<c:out value="${ 3 + 3  }"/> 
	
	<section>
		<p>Previous name was <c:out value="${name }" /></p>
		<p>Previous age was <c:out value="${age }" /></p>
		${ cat }
	</section>
	
	
	<section>
		<fieldset>
			<legend>Names</legend>
			
			<form action="/posted" method="POST" autocomplete="off">
				<div>
					<label>Name</label>
					<input type="text" name="name" />
				</div>
				<div>
					<label>Age</label>
					<input type="number" name="age" />
				</div>
				
				<button>Submit</button>
			</form>
		</fieldset>
	</section>
</body>
</html>