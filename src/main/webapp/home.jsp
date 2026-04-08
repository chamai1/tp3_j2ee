<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>

    <h2>Page d'accueil</h2>

    <%
    
        String userEmail = (String) session.getAttribute("userEmail");

        
        if (userEmail == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>

  
    <p>Bienvenue : <%= userEmail %></p>

 
    <a href="logout">Logout</a>

</body>
</html>
