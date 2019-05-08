<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>

<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">
	
		<label>Ingrese un nombre: </label>
		<form:input type="text" name="name" path="name"/>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una marca: </label>
		<form:input type="text" name="brand" path="brand"/><br>
		<form:errors path="brand" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una descripci&oacute;n: </label>
		<form:input type="text" name="desc" path="desc"/><br>
		<form:errors path="desc" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una categor&iacute;a: </label>
		<form:input type="text" name="cat" path="cat"/><br>
		<form:errors path="cat" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese un precio: </label>
		<form:input type="text" name="price" path="price"/><br>
		<form:errors path="price" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una fecha de vencimiento: </label>
		<form:input placeholder="dd/mm/yyyy" type="text" name="date" path="date"/><br>
		<form:errors path="date" cssStyle="color:#E81505;"></form:errors><br>
		
		<input type="submit" value="Agregar producto">
	</form:form>
</body>
</html>