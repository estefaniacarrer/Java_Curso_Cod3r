package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1,  nome); 
		// PrepareStatement -> comando para garantia da segurança, visto que 
		// o que for digitado no Scanner agora é limitado para String, sem 
		// possibilidade de ser um comando alteração do banco de dados
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");		
		entrada.close();
	}

}
