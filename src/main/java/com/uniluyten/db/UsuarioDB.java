package com.uniluyten.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.uniluyten.connection.SQLServerConnection;
import com.uniluyten.encriptar.EncryptUtil;
import com.uniluyten.model.Usuario;

public class UsuarioDB {
	
private SQLServerConnection sqlServerConnection = new SQLServerConnection();
	
	public String crearUsuario(Usuario usuario) {
		String mensaje = "";
		
		try {
			Connection conn = sqlServerConnection.getConnection();
			String sqlInsert = "INSERT INTO USUARIOS (nombre, apellidoPaterno, apellidoMaterno, email, telefono, pais, password, activo)\n"
					+ "VAlUES(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sqlInsert);
			
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getApellidoPaterno());
			statement.setString(3, usuario.getApellidoMaterno());
			statement.setString(4, usuario.getEmail());
			statement.setString(5, usuario.getTelefono());
			statement.setString(6, usuario.getPais());
			statement.setString(7, EncryptUtil.encode(usuario.getPassword()));
			statement.setBoolean(8, false);
			
			statement.executeUpdate();
			
			mensaje += "Usuario creado de forma exitosa, Verificar email para activar";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensaje;
	}
	
	public void activarCuenta(String email) {
		
		try {
			Connection conn = sqlServerConnection.getConnection();
			String sqlUpdate = "UPDATE USUARIOS SET activo = 1 WHERE email = '" + email + "'";
			Statement statement = conn.createStatement();
			statement.executeUpdate(sqlUpdate);
			
			System.out.println("Cuenta " + email + " Activada!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Usuario login(String email) {
		Usuario usuario = null;
		
		try {
			Connection conn = sqlServerConnection.getConnection();
			
			String sqlSelect = "SELECT nombre, apellidoPaterno, apellidoMaterno, email, telefono, pais, password, activo "
					+ "FROM USUARIOS WHERE email='" + email + "'";
			
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery(sqlSelect);
			
			while(rs.next()) {
				usuario = new Usuario();
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellidoPaterno(rs.getString("apellidoPaterno"));
				usuario.setApellidoMaterno(rs.getString("apellidoMaterno"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setPassword(rs.getString("password"));
				usuario.setPais(rs.getString("pais"));
				usuario.setActivo(rs.getBoolean("activo"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return usuario;
	}
	
	public void cambiarPassword(String email, String password) {
		try {
			Connection conn = sqlServerConnection.getConnection();
			String sqlUpdate = "UPDATE USUARIOS SET password = '"+EncryptUtil.encode(password)+"' WHERE email = '"+email+"';";
			Statement statement = conn.createStatement();
			statement.executeUpdate(sqlUpdate);
			
			System.out.println("Password de: " + email + " se cambio");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
