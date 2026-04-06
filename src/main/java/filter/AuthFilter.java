package filter;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// Filter pour protéger les pages
@WebFilter("/home.jsp")
public class AuthFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // récupérer session
        HttpSession session = req.getSession(false);

        // vérifier login
        if (session != null && session.getAttribute("userEmail") != null) {

            // user connecté → continuer
            chain.doFilter(request, response);

        } else {
            // user non connecté → redirect login
            res.sendRedirect("login.jsp");
        }
    }
}