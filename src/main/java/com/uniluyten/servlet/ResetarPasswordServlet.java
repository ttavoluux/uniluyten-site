package com.uniluyten.servlet;

import java.io.IOException;

import com.uniluyten.mail.EmailService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resetearPassword")
public class ResetarPasswordServlet extends HttpServlet{

	private static final long serialVersionUID = -5278379918268550374L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		
		EmailService emailService = new EmailService();
		emailService.sendMailRPassword(email);
		req.setAttribute("respuesta", "Se envio correo de restablecimiento");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
