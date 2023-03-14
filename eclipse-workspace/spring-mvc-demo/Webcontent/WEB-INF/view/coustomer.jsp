<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>this is my coustomer file</title>

<style>
.error {
	color: red
}
</style>

</head>

<body>

	Fill out the fields in the given below

	<form:form action="processform" modelAttribute="customer">


First name:<form:input path="firstname" />

		<br>
		<br>

Last Name:<form:input path="lastname" />
	

	</form:form>

</body>

</html>