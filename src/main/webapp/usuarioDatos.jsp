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
            <label for="id">ID: </label> ${id}
            <br><br>
            <label for="nombre">Nombre: </label> ${nombre}
            <br><br>
            <label for="email">Email: </label> ${email}
            <br><br>
            <label for="nacionalidad">Nacionalidad: </label> ${nacionalidad}
        </form>
    </body>
</html>

