package jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
//		final String url = "url"; 
//		
//		//opçao para url //localhost?verifyServerCertificate=false&useSSL=true";
//		//conexão segura
//		//ou apenas conectar com a porta que será utilizada //localhost:3306";
//		
//		final String usuario = "usuario";
//		final String senha = "senha";
//		
//		// é uma excecao
//		Connection conexao = DriverManager
//				.getConnection(url, usuario, senha);
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
