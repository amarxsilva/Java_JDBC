package br.com.via.JDBC_java;

import java.sql.Connection;

import br.com.via.dao.UsuarioDAO;
import br.com.via.model.Usuario;;

public class TestarInserir {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Usuario usuario = new Usuario();
		usuario.setUsuario("Ricardo");
		usuario.setSenha("123");
		usuario.setTipo("admin");
		UsuarioDAO dao = new UsuarioDAO(con);
		System.out.println(dao.inserir(usuario));
		
		Conexao.fecharConexao(con);

	}

}
