package com.misitio.servlet;

import java.io.IOException;

import com.misitio.db.UsuarioDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cambiarPassword")
public class CambiarPassword extends HttpServlet{

	private static final long serialVersionUID = -6232628090899124137L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String newPassword = req.getParameter("password");
		
		UsuarioDB usuarioDB = new UsuarioDB();
		
		usuarioDB.cambiarPassword(email, newPassword);
		
		req.setAttribute("respuesta", "Se cambio el password!");
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
}
