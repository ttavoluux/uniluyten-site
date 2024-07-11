package com.uniluyten.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import com.uniluyten.db.UsuarioDB;
import com.uniluyten.encriptar.EncryptUtil;
import com.uniluyten.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 8271853448569548495L;

Logger log = Logger.getLogger(LoginServlet.class.getName());
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("usuario");
		String password = req.getParameter("password");
		
		log.info("Usuario entrando a system: " + email);
		
		
		UsuarioDB usuarioDB = new UsuarioDB();
		
		String respuesta = null;
		String pagina = null;
		
		Usuario usuario = usuarioDB.login(email);
		
		if(usuario == null) {
			respuesta = "Usuario No Existe";
			pagina = "index.jsp";
		}else if(!usuario.isActivo()) {
			respuesta = "Usuario no se encuentra activo favor de confirmar email";
			pagina = "index.jsp";
		}else if(!EncryptUtil.decode(usuario.getPassword()).equals(password)) {
		respuesta = "Password Incorrecta";
		pagina = "index.jsp";
		}else {
			respuesta = "Acceso exitoso!";
			req.setAttribute("usuario", usuario);
			
			HttpSession session = req.getSession();
			
			session.setAttribute("user", usuario);
			
			pagina = "home.jsp";
		}
		
		req.setAttribute("respuesta", respuesta);
		req.getRequestDispatcher(pagina).forward(req, resp);
	}
}
