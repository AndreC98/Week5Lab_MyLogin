/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Models.AccountService;
import Models.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andre
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (request.getParameter("logout") != null) {
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You have successfully logged out");
        }
        
        String username = "";
        String sessionUsername = (String) session.getAttribute("username");
        
        if (sessionUsername != null) {
            response.sendRedirect("/home");
            return;
        }
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = "";
        String password = "";
        int i = 0;
        while (i == 0) {
            username = request.getParameter("username");
            if (username == null || username.length() == 0) {
                request.setAttribute("message", "Username must not be blank!");
                i = 1;
            } else {
                password = request.getParameter("password");
                if (password.length() <= 0) {
                    request.setAttribute("message", "Password must not be blank!");
                    i = 1;
                } else {
                    AccountService checker = new AccountService();
                    User user = checker.login(username, password);
                    if (user == null) {
                        request.setAttribute("message", "Error loading account information!");
                        i = 1;
                    } else {
                        HttpSession session = request.getSession();
                        session.setAttribute("username", username);
                        String reDirectURL = "/home";
                        response.sendRedirect(reDirectURL);
                        return;
                    }
                }

            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

}
