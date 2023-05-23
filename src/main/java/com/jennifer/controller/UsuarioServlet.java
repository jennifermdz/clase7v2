/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jennifer.controller;

import com.jennifer.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {

    // Se crea un objeto "user" de clase Usuario.
    Usuario user = new Usuario();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Se asigna valores como atributos al objeto "req" que se obtienen del
        // objeto "user".
        req.setAttribute("nombre", user.getNombre());
        req.setAttribute("email", user.getEmail());

        // Se redirecciona al JSP "usuarioDatos.jsp" para mostrar los valores
        // de los atributos.
        req.getServletContext().getRequestDispatcher("/usuarioDatos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Se asigna valores al objeto "user" que se obtienen por parametros 
        // desde "usuario.jsp".
        user.setNombre(req.getParameter("nombre"));
        user.setEmail(req.getParameter("email"));

        // Se redirecciona al servlet "/UsuarioServlet", es decir a este mismo
        // servlet para ejecutar el metodo doGet.
        resp.sendRedirect(req.getContextPath() + "/UsuarioServlet");
    }
}
