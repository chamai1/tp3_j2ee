<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h2>Login</h2>

    <!-- Message d'erreur si login incorrect -->
    <%
        String error = request.getParameter("error");
        if (error != null) {
    %>
        <p style="color:red;">Email ou mot de passe incorrect</p>
    <%
        }
    %>

    <!-- Formulaire de connexion -->
    <form action="login" method="post">
        Email: <input type="text" name="email"><br><br>
        Password: <input type="password" name="password"><br><br>
        <input type="submit" value="Se connecter">
    </form>

</body>
</html>