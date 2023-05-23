<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario</title>
    </head>
    <body>
        <h1>Registro de Usuario</h1>
        <form action="<%= request.getContextPath() %>/UsuarioServlet" method="POST">
            <label for="id">ID: </label>
            <input type="text" name="id">
            <br><br>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre">
            <br><br>
            <label for="email">Email: </label>
            <input type="email" name="email">
            <br><br>
            <label for="nacionalidad">Nacionalidad: </label>
            <input type="text" name="nacionalidad">
            <br><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
