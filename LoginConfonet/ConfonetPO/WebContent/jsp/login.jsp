<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form name="register" method="POST">
<div align ="center">
<table>
<tr>
<td>User ID</td>
<td><input type="text" name="UserId"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="Password"></td>
</tr>
<tr><td><input type="submit" name="Login"></td></tr>

 <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="welcome.jsp">Home</a>
                        </td>
                    </tr>
</table>
</div>
</form:form>
</body>
</html>