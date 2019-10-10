<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checkers</title>
<link rel="stylesheet" href="styles.css" >
</head>
<body>
<%! 
// methods  go here

public boolean isEven(int a, int b) {
	return (a + b) % 2 == 0;
}
%>

<%
// declarations go here
int width = 0;
int height = 0;
String error = null;

try {
	width = Integer.parseInt(request.getParameter("width"));
	height = Integer.parseInt(request.getParameter("height"));	
} catch(NumberFormatException e) {
	error = "There was a problem parsing width and height. Did you provide them?";
}

%>

	<% if (error != null) { %>
		<h1><%= error %> </h1>
	<% } else { %>
		<h1>CheckerBoard: <%= width %>w X <%= height %>h</h1>
	<% } %>
	<div class='board'>
		<% for(int i = 0; i < height; i++) { %>
		<div class='row'>
		
			<% for(int j = 0; j < width; j++) { %>
				<div class='square <%= isEven(i, j) ? "even" : "odd" %> '></div>
			<% } %>
		</div>
		<% } %>
	</div>
</body>
</html>