<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h2>Login</h2>

   
    <%
        String error = request.getParameter("error");
        if (error != null) {
    %>
        <p style="color:red;">Email ou mot de passe incorrect</p>
    <%
        }
    %>

   
    <form action="login" method="post">
        Email: <input type="text" name="email"><br><br>
        Password: <input type="password" name="password"><br><br>
        <input type="submit" value="Se connecter">
    </form>

</body>
</html>
