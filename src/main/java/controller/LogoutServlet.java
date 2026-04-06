package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// Servlet pour gérer le logout
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer la session existante
        HttpSession session = request.getSession(false);

        // Si la session existe, on la supprime
        if (session != null) {
            session.invalidate();
        }

        // Retour vers login.jsp
        response.sendRedirect("login.jsp");
    }
}