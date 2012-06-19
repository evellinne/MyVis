package ufrpe.bcc.dbpostgres;
import java.sql.Connection;
import java.sql.SQLException;


public interface BancoDados {

	public abstract Connection getConexao() throws SQLException;
	
}
