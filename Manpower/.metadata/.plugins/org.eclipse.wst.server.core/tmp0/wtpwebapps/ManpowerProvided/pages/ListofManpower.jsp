<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manpower Details</title>
</head>
<body>
<form:form method="post" action="add" name="myForm" commandName="manpower" onsubmit="return(validate())">
<table>
<tr><td>
<form:label path="state">State Name:</form:label></td>
<td><form:input path="state"/>
</td></tr>
<tr><td>
<form:label path="district">District Name:</form:label></td>
<td><form:input path="district"/>
</td></tr>
<tr><td>
<form:label path="designation">Designation:</form:label></td>
<td><form:input path="designation"/>
</td></tr>
<tr><td>
<form:label path="name">Employee Name:</form:label></td>
<td><form:input path="name"/>
</td></tr>
<tr><td>
<form:label path="email">Email Id:</form:label></td>
<td><form:input path="email"/>
</td></tr>
<tr><td>
<form:label path="phone">Phone No.:</form:label></td>
<td><form:input path="phone"/>
</td></tr>
<tr><td>
<form:label path="dateofJoining">Date of Joining:</form:label></td>
<td><form:input path="dateofJoining"/>
</td></tr>
<tr><td>
<form:label path="poorder">PO Order:</form:label></td>
<td><form:input path="poorder"/>
</td></tr>
<tr><td>
<form:label path="vendor">Vendor Name:</form:label></td>
<td><form:input path="vendor"/>
</td></tr>

<tr><td><input type="submit" value="submit"/> </td></tr>
</table></form:form>
<c:if test="${!emptymanpowerList }">
<table class="data">

<tr><th>State Name</th>
<th>District Name</th>
<th>Designation</th>
<th>Employee Name</th>
<th>Email Id</th>
<th>Phone No.</th>
<th>Date of Joining</th>
<th>PO Order</th>
<th>Vendor Name</th>
</tr>
<c:forEach items="${manpowerList }" var="mp">
<tr><td>${mp.state }</td>
<td>${mp.district }</td>
<td>${mp.designation }</td>
<td>${mp.name }</td>
<td>${mp.email }</td>
<td>${mp.phone }</td>
<td>${mp.dateofJoining }</td>
<td>${mp.poorder }</td>
<td>${mp.vendor }</td>
</tr>
</c:forEach>
</table>

</c:if>

</body>
</html>