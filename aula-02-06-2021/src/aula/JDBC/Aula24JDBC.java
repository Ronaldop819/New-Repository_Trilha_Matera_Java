package aula.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aula24JDBC {
	private final String url = "jdbc:postgresql://database-1.cvitjixrebr2.us-east-1.rds.amazonaws.com/db_ronaldo";
	private final String user = "ronaldo";
	private final String password = "ronaldo2021!";
	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 * @throws Exception 
	 */
	public Connection connect() throws Exception {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			if (conn != null) {
				throw new Exception();
				
			}
			
			ClienteDAO clienteDAO = new ClienteDAO();
				int codigoCliente = clienteDAO.criaNovoCliente("Armandinho da Cunha", "02212325665", "254856", 5000f, "6199854562312", "armandinhodac@gmail.com", conn);
				
				ContaDAO contaDAO = new ContaDAO();
				String numeroConta = contaDAO.criaNovaConta(codigoCliente, "2000", conn);
				
				System.out.println(numeroConta);
				
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return conn;
	}
	public static void main(String[] args) throws Exception {
		Aula24JDBC app = new Aula24JDBC();
		app.connect();
	}
}