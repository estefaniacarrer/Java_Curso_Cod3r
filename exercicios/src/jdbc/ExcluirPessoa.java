package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		//ou "DELETE FROM pessoas WHERE codigo > ?" -> vai excluir todas
		//as pessoas com o id maior que o código informado
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
		   System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Código inválido!");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
		
	}

}
