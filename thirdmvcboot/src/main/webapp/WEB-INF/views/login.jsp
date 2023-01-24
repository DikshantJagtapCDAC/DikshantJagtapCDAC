<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="authenticate" modelAttribute ="objUser">
	User Name : <form:input path = "UserName"/><br/>
	password : <form:password path = "password"/><br/>
     <form:button> Login </form:button>

</form:form>

</body>
</html>