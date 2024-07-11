<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="imagenes/imagen.jpeg">

<h1 style="color:white">Universidad Luyten</h1>

<hr/>

<h2 style="color:white">Alumno: ${usuario.getNombreCompleto()}</h2>

<hr/>
<br/>


<a href="home.jsp">Inicio | </a>
<a href="materias.jsp">Materias | </a>
<a href="horarios.jsp">Horarios | </a>
<a href=${pageContext.request.contextPath}/informacionAlumno>Informacion del Alumno | </a>
<a href="solicitudBecas.jsp">Solicita una Beca | </a>
<a href=${pageContext.request.contextPath}/logout>Cerrar Session</a>

</body>
</html>