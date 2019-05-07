<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <div align="center" style="margin-top: 50px;">
    <h1>Inicio de Sesión</h1>
 
    <form action="validarS.do" method="post">
      <input type="email" name="txtMail" placeholder="E-MAil" size="20px" required="required"/> <br>
      <input type="password" name="txtPass" placeholder="Contraseña" size="20px" required="required"/> <br><br>
      <input type="submit" value="Iniciar Seción">
    </form>
  </div>
  
  <div align="center" style="margin-top: 50px;">
    <h1>Crear una cuenta</h1>
 
    <form action="Guardar" method="post">
    <table> 
      <tr><td><input type="email" name="txtMail" placeholder="E-MAil" size="20px" required="required"/><br></td></tr>
      <tr><td><input type="password" name="txtPass"placeholder="Contraseña" size="20px" required="required" /><br><br></td></tr> 
      <tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>
    </table> 
    </form>
  </div>
    
</body>
</html>