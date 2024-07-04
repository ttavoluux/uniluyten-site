package com.misitio.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	private static final long serialVersionUID = 8169344918339197865L;

	Logger log = Logger.getLogger(LogoutServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession(false).invalidate();
		req.setAttribute("respuesta", "Se cerro la Session!!");
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
	}
}
