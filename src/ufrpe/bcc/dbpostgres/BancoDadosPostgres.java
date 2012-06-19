package ufrpe.bcc.dbpostgres;


import java.sql.*;

import org.postgresql.Driver;


public class BancoDadosPostgres implements BancoDados{
	
	private static BancoDados instancia = new BancoDadosPostgres();
	
	private static boolean driverCarregado = false;
	
	public static BancoDados getInstancia() {
		return instancia;
	}
	
	
	public static void setDriverCarregado(boolean driverCarregado) {
		BancoDadosPostgres.driverCarregado = driverCarregado;
	}
	
	@Override
	public Connection getConexao() throws SQLException {
		Connection retorno = null;
		
		if (!driverCarregado) {			
			DriverManager.registerDriver(new Driver());
			driverCarregado = true;
		}	
			retorno = DriverManager.getConnection("jdbc:postgresql:myvis:@localhost:5432", "postgres", "admin");
	
		return retorno;
	}



	

}
