<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>

    <h2>Page d'accueil</h2>

    <%
        // Récupérer l'utilisateur depuis la session
        String userEmail = (String) session.getAttribute("userEmail");

        // Vérifier si l'utilisateur est connecté
        if (userEmail == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>

    <!-- Afficher email de l'utilisateur connecté -->
    <p>Bienvenue : <%= userEmail %></p>

    <!-- Lien pour logout -->
    <a href="logout">Logout</a>

</body>
</html>