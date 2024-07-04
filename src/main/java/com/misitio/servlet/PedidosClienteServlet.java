package com.misitio.servlet;

import java.io.IOException;

import com.misitio.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/pedidosCliente")
public class PedidosClienteServlet extends HttpServlet{

	private static final long serialVersionUID = 7508717261137757453L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			Usuario usuario = (Usuario)session.getAttribute("user");
			if(usuario != null) {
				System.out.println("Usuario: " + usuario.getNombreCompleto());
				req.setAttribute("mensaje", "Mostrar Pedidos de:" + usuario.getNombreCompleto());
			}else {
				req.setAttribute("mensaje", "Logearse Primero Para realizar esta operacion");
			}
		}
		else {
			req.setAttribute("mensaje", "Logearse Primero Para realizar esta operacion");
		}
		
		req.getRequestDispatcher("pedidosCliente.jsp").forward(req, resp);
	}
}
