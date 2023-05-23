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
        // Se asignan valores como atributos al objeto "req" que se obtienen del objeto "user".
        req.setAttribute("id", user.getId());
        req.setAttribute("nombre", user.getNombre());
        req.setAttribute("email", user.getEmail());
        req.setAttribute("nacionalidad", user.getNacionalidad());

        // Se redirecciona al JSP "usuarioDatos.jsp" para mostrar los valores de los atributos.
        req.getServletContext().getRequestDispatcher("/usuarioDatos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Se asignan valores al objeto "user" que se obtienen por parámetros desde "usuario.jsp".
        
        user.setNombre(req.getParameter("nombre"));
        user.setEmail(req.getParameter("email"));
        user.setNacionalidad(req.getParameter("nacionalidad"));

        // Se redirecciona al servlet "/UsuarioServlet", es decir, a este mismo servlet para ejecutar el método doGet.
        resp.sendRedirect(req.getContextPath() + "/UsuarioServlet");
    }
}
