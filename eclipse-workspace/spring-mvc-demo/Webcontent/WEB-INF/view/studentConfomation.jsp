<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstname} ${student.lastname}

<br><br>
Country: ${student.country}
<br><br>
Fovarate Language Is : ${student.radio}

<ul>
<c:forEach var="temp" items="${student.checkbox}">
<li>${temp}</li>
</c:forEach>

</ul>

</body>

</html>

