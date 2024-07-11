<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Becas</title>
</head>
<body background="imagenes/imagen.jpeg">

<h1 style="color:white">Solicitud de Becas</h1>

<hr/>
<br/>

<form action="SolicitudBecas" method="post">
<table>
<tr><td><label style="color:white">Nombre:</label></td>
<td><input type="text" name="nombre"></td></tr>


<tr><td><label style="color:white">Apellido Paterno:</label></td>
<td><input type="text" name="apellidoPaterno"></td></tr>


<tr><td><label style="color:white">Apellido Materno:</label></td>
<td><input type="text" name="apellidoMaterno"></td></tr>


<tr><td><label style="color:white">Semestre:</label></td>
<td><input type="text" name="semestre"></td></tr>


<tr><td><label style="color:white">Carrera:</label></td>
<td><input type="text" name="carrera"></td></tr>


<tr><td><label style="color:white">Edad:</label></td>
<td><input type="text" name="edad"></td></tr>

<tr><td><button type="submit">Solicitar Beca</button></td></tr>

</table>


</form>
<br/>

<a href="home.jsp">Inicio | </a>
<a href="materias.jsp">Materias | </a>
<a href="horarios.jsp">Horarios | </a>
<a href=${pageContext.request.contextPath}/informacionAlumno>Informacion del Alumno | </a>
<a href="solicitudBecas.jsp">Solicita una Beca | </a>
<a href=${pageContext.request.contextPath}/logout>Cerrar Session</a>

</body>
</html>