package thucHanh;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FormLogin", value = "/FormLogin")
public class FormLogin extends HttpServlet {
  public   String title = "";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
public void display(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("title",title);
        request.getRequestDispatcher("view\\Formlogin.jsp").forward(request,response);
}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action.equals("SignIn")){
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
    if (userName.equals("admin") && password.equals("admin")){
title = "welcome admin";
    } else {
        title = "singIn error";
    }
    display(request,response);
}

    }
}
