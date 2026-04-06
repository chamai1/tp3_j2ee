package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

// Servlet pour gérer le login
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les valeurs du formulaire
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Utilisateur simple fixe juste pour test
        User user = new User("admin@gmail.com", "1234");

        // Vérifier si email et mot de passe sont corrects
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {

            // Créer une session
            HttpSession session = request.getSession();

            // Stocker l'email dans la session
            session.setAttribute("userEmail", email);

            // Redirection vers home.jsp
            response.sendRedirect("home.jsp");

        } else {
            // Si login incorrect, retourner vers login avec message erreur
            response.sendRedirect("login.jsp?error=1");
        }
    }
}