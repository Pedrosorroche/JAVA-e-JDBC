import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT id, nome, descricao FROM produto");
		ResultSet rst = stm.getResultSet();
		 
		while(rst.next()) {
			Integer id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String  descricao = rst.getNString("descricao");
			System.out.println(descricao);
			
		}
		
		connection.close();

	}

}
