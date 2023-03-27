package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
//        final String url = ""; 
//		final String usuario = "";
//		final String senha = "";
//		
//		Connection conexao = DriverManager
//				.getConnection(url, usuario, senha);
		
		Connection conexao = FabricaConexao.getConexao(); //-- posso utilizar apenas
		// esse comando para conexão no lugar das  5 linhas anteriores
		
		Statement stmt = conexao.createStatement(); //conexao com o banco de dados
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	
	}
}
