<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processform" modelAttribute="student">
	
		First name: <form:input path="firstname" />
		
		<br><br>
	
		Last name: <form:input path="lastname" />
		
		<br><br>
		
		<form:select path="country">
		<form:options items="${student.countryoption}" />
	
		</form:select>
		<br><br>
		java<form:radiobutton path="radio" value="java"/>
			python<form:radiobutton path="radio" value="python"/>
				c#<form:radiobutton path="radio" value="c#"/>
					ryby<form:radiobutton path="radio" value="ruby"/>
		<br><br>
		
		operation Stytems:
		lunex:<form:checkbox path="checkbox" value="lunex"/>
		mac os:<form:checkbox path="checkbox" value="mac os"/>
		Windows:<form:checkbox path="checkbox" value="Windows"/>
		
		
		
		
		<br><br>
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>


