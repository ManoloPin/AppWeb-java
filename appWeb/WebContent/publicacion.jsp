<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>publicar</title>
  <link rel="stylesheet" href="css/inicio.css"/>
</head>
<body>
  <%@include file="menu.jsp" %>

     <form action="GuardarPubli" method="post">  
	   <table> 
	     <tr><td><h4>noticia:</h4></td></tr> 
	     <tr><td>Titulo:</td><td><input  type="text" name="txtTitulo"  placeholder="Titulo" /> <br> </td></tr> 
	     <tr><td>URL:</td><td><input type="text" name="txtURL" placeholder="URL" /> <br><br> </td></tr> 
	     <tr><td><input type="submit" value="Enviar-noticia"></td></tr> 
	   </table>
	 </form> 
	<form action="GuardarPregunta" method="post">  
	   <table>  
	     <tr><td><h4>Pregunta:</h4></td></tr> 
	     <tr><td>Texto:</td><td><textarea name="Texto" rows="10" cols="50" placeholder="Texto pregunta"></textarea> <br><br> </td></tr> 
	     <tr><td><input type="submit" value="Enviar-pregunta"></td></tr>
       </table>
	</form>
  <a href="VerPubli">vew publicacion</a> 
  <a href="VistaEdiPregunta">ver preguntas</a>
</body>
</html>