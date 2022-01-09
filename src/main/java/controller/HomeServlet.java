package controller;

import model.Product;
import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        RequestDispatcher requestDispatcher ;
        switch (action){
            case "login":
                String userName = req.getParameter("userName");
                String password = req.getParameter("password");
                HttpSession session = req.getSession();
                try {
                    User user = userService.checkLogin(userName,password);
                    if(user == null){
                        resp.sendRedirect("/home");
                    }else if (user.getId_role()==1){
                        session.setAttribute("user",user);
                        resp.sendRedirect("/admin");
                    }else {
                        session.setAttribute("user",user);
                        List<Product> cartProductList = new ArrayList<>();
                        session.setAttribute("cartProductList",cartProductList);
                        resp.sendRedirect("/index.jsp");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:resp.sendRedirect("/view/jsp/login.jsp");break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
