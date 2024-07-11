package com.uniluyten.servlet;

import java.io.IOException;

import com.uniluyten.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/informacionAlumno")
public class InformacionAlumnoServlet extends HttpServlet{

	private static final long serialVersionUID = 7508717261137757453L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			Usuario usuario = (Usuario)session.getAttribute("user");
			if(usuario != null) {
				System.out.println("Usuario: " + usuario.getNombreCompleto());
				req.setAttribute("mensaje", "Informacion de: " + usuario.getNombreCompleto());
			}else {
				req.setAttribute("mensaje", "Logearse Primero Para realizar esta operacion");
			}
		}
		else {
			req.setAttribute("mensaje", "Logearse Primero Para realizar esta operacion");
		}
		
		req.getRequestDispatcher("infoAlumno.jsp").forward(req, resp);
	}
}
