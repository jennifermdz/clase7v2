

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos de Usuario</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <form>
            <label for="nombre">Nombre: </label> <%= request.getAttribute("nombre") %>
            <br><br>
            <label for="email">Email: </label> <%= request.getAttribute("email") %>
        </form>
    </body>
</html>
