<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%String nome = (String) session.getAttribute("nome");
		double conta = (double) request.getAttribute("conta");
	%>
	<h1><%=nome %></h1>
	<h1><%=conta %></h1>

</body>
</html>