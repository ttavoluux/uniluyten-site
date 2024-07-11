package com.uniluyten.servlet;

import java.io.IOException;

import com.uniluyten.db.UsuarioDB;
import com.uniluyten.mail.EmailService;
import com.uniluyten.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registrarUsuario")
public class RegistroUsuarioServlet extends HttpServlet{

	private static final long serialVersionUID = 3341307523240022133L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = req.getParameter("nombre");
		String apellidoPaterno = req.getParameter("apellidoPaterno");
		String apellidoMaterno = req.getParameter("apellidoMaterno");
		String email = req.getParameter("email");
		String telefono = req.getParameter("telefono");
		String pais = req.getParameter("pais");;
		String password = req.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellidoPaterno(apellidoPaterno);
		usuario.setApellidoMaterno(apellidoMaterno);
		usuario.setEmail(email);
		usuario.setEmail(email);
		usuario.setTelefono(telefono);
		usuario.setPais(pais);
		usuario.setPassword(password);
		
		UsuarioDB usuarioDB = new UsuarioDB();
		
		String respuesta = usuarioDB.crearUsuario(usuario);
		
		EmailService service = new EmailService();
		service.sendMail(usuario.getNombreCompleto(), usuario.getEmail());
		req.setAttribute("respuesta", respuesta);
		
		System.out.println("Usuario creado de forma exitosa !!");
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
}
