package com.uniluyten.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SolicitudBecas")
public class SolicitudBecasServlet extends HttpServlet{

	private static final long serialVersionUID = 7904149748153749418L;
	
	Logger log = Logger.getLogger(SolicitudBecasServlet.class.getName());
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String lugarDeEstudio = req.getParameter("lugarDeEstudio");
		String nombreDelSolicitante = req.getParameter("nombreDelSolicitante");
		String tipoDeBeca = req.getParameter("tipoDeBeca");
		
		log.info("Lugar de Estudio: "  + lugarDeEstudio);
		log.info("Nombre del Solicitante: "  + nombreDelSolicitante);
		log.info("Tipo de Beca: "  + tipoDeBeca);
		
		log.info("DATOS ENVIADOS DE FORMA EXITOSA!");
	}

}
