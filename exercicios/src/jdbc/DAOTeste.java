package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "João da Silva", 5));  
		System.out.println(dao.incluir(sql, "Ana Julia", 6));
		System.out.println(dao.incluir(sql, "Djalma Pereira", 13 ));
		
		dao.close();
	}
}
