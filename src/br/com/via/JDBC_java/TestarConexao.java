package br.com.via.JDBC_java;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		Conexao.fecharConexao(con);
		
	}

}
