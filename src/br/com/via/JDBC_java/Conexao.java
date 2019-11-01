package br.com.via.JDBC_java;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {

	public static Connection abrirConexao() {

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "";
			url += "jdbc:mysql://localhost:3306/java?";
			url += "user=root&password=";
			con = DriverManager.getConnection(url);
			System.out.println("Conexão aberta");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return con;

	}
	public static void fecharConexao(Connection con) {

		try {
			con.close();
			System.out.println("Conexão fechada");
		} catch (SQLException e) {
			e.printStackTrace();

	}
	}
}
