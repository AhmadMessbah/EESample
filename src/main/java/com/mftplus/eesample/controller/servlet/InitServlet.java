package com.mftplus.eesample.controller.servlet;

import com.mftplus.eesample.model.Role;
import com.mftplus.eesample.model.User;
import com.mftplus.eesample.service.UserService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/init", loadOnStartup = 1)
public class InitServlet extends HttpServlet {
    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Role adminRole = Role.builder().roleName("admin").build();
        User user = User.builder().username("ahmad").password("ahmad123").role(adminRole).build();
    }
}
