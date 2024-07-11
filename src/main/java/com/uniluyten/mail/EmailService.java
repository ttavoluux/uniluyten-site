package com.uniluyten.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.uniluyten.ultil.Constants;

public class EmailService {

private static final String SERVLET = "http://localhost:9080/uniluyten-site/activar";
private static final String SERVLETPASS = "http://localhost:9080/uniluyten-site/cambiarPassword.jsp";

	
	public void sendMail(String nombreCompleto, String email){
		String from = "gustavoaguilas149@gmail.com";
		
		final String username = "gustavoaguilas149@gmail.com";
		final String password = Constants.PASSWORD;
		
		Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.user", username);
	    props.put("mail.smtp.clave", password);
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);
		
		try {
			message.setFrom(new InternetAddress(from));
			
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			
			message.setSubject("Activacion de cuenta!!");
			
			message.setContent("Bienvenido " + nombreCompleto + " a Universidad Luyten, para activar tu cuenta sigue el siguiente link: "
					+ "<a href=\"" + SERVLET + "?email=" + email + "\">Activar mi Cuenta</a>", "text/html");
			
			Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", username, password);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
			
			System.out.println("Email de confirmacion enviado de forma exitosa!");
			
			
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void sendMailRPassword(String email){
		String from = "gustavoaguilas149@gmail.com";
		
		final String username = "gustavoaguilas149@gmail.com";
		final String password = Constants.PASSWORD;
		
		Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.user", username);
	    props.put("mail.smtp.clave", password);
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);
		
		try {
			message.setFrom(new InternetAddress(from));
			
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			
			message.setSubject("Activacion de cuenta!!");
			
			message.setContent("Hola para restablecer tu password sigue el siguiente link sigue el siguiente link: "
					+ "<a href=\"" + SERVLETPASS + "?email=" + email + "\">Cambiar Password</a>", "text/html");
			
			Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", username, password);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
			
			System.out.println("Email de confirmacion enviado de forma exitosa!");
			
			
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
