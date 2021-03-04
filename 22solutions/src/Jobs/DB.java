package Jobs;

import Accounts.*;

public class DB implements I_DBcon {

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public int write(String sql, Connection conn) {
		// TODO - implement DB.write
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public Connection connect(String sql) {
		// TODO - implement DB.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public boolean closeConnection(String sql, connection conn) {
		// TODO - implement DB.closeConnection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public resultSet read(String sql, Connection conn) {
		// TODO - implement DB.read
		throw new UnsupportedOperationException();
	}

}