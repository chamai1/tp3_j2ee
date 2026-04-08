package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        
        User user = new User("admin@gmail.com", "1234");

        
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {

           
            HttpSession session = request.getSession();

            
            session.setAttribute("userEmail", email);

           
            response.sendRedirect("home.jsp");

        } else {
            
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
