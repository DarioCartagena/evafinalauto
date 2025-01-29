<%-- 
    Document   : Login
    Created on : 28-01-2025, 20:12:40
    Author     : JOSE DARIO CARTAGENA
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Incio de sesion</title>
</head>
<body>
    <h1>Iniciar sesión</h1>
    <form action="welcome" method="post">
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br>
        <button type="submit">Login</button>
    </form>
    <p style="color:red;">
        <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
    </p>
</body>
</html>