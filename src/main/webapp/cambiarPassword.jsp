<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resetar password</title>
</head>
<body>

<form action="cambiarPassword" method="post">

<table>
<tr>
<td>
<label>Confirme el email</label>
</td>
<td><input type="email" name="email"></td>

</tr>



<tr>
<td><label>Nuevo password</label></td>
<td><input type="text" name="password"></td>
</tr>

<tr>
<td><button type="submit">Cambiar Password</button></td>
</tr>
</table>

</form>
</body>
</html>