<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recuperar password</title>
</head>
<body>
	<h1>Ingresa tu Correo</h1>
	
	<form action="resetearPassword" method="post">
	
	<table>
	<tr>
	<td><input type="email" name="email"></td>
	</tr>
	
	<tr>
	<td><button type="submit">Recuperar password</button></td>
	</tr>
	</table>
	
	</form>
	
	<h3> ${respuesta} </h3>
	
</body>
</html>