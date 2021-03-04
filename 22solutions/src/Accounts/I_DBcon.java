package Accounts;

public interface I_DBcon {

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract int write(String sql, Connection conn);

	/**
	 * 
	 * @param sql
	 */
	abstract Connection connect(String sql);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract boolean closeConnection(String sql, connection conn);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract resultSet read(String sql, Connection conn);

}