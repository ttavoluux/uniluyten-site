<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body background="imagenes/imagen.jpeg">

<h2 style="color:white"> Login </h2>

	<form action="login" method="post">
	
	<table>
	
	<tr>
		<td><label style="color:white">Usuario:</label></td>
		<td> <input type="text" name="usuario"></td>
	</tr>
	
	<tr>
		<td><label style="color:white">Password:</label></td>
		<td> <input type="password" name="password"></td>
	</tr>
	
	<tr>
		<td><label></label></td>
		<td> <button type="submit"> Entrar</button></td>
	</tr>
	
	</table>
	
	</form>

	<table>
	
	<tr>
		<td><label> ${respuesta} </label></td>
		<td></td>
	</tr>
	
	<tr>
	 <td><a href="crearCuenta.jsp">Crear Cuenta Nueva</a></td>
	 <td><a href="recuperarPassword.jsp">Recuperar Password</a></td>
	 <td></td>
	</tr>
	
	<tr>
	 <td><a href="#">Iniciar con Facebook</a></td>
	 <td><a href="#">Iniciar con Google</a></td>
	 <td></td>
	</tr>
	</table>
</body>
</html>