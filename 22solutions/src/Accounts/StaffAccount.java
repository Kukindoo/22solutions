package Accounts;

public class StaffAccount extends Accounts {

	Alert manager;
	private String role;
	private String username;
	private String password;
	private String employeeJobHistory;
	private String employeeDetails;
	private button saveEmployee;

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		// TODO - implement StaffAccount.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement StaffAccount.logout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerName
	 */
	public CustomerAccount getCustomer(String customerName) {
		// TODO - implement StaffAccount.getCustomer
		throw new UnsupportedOperationException();
	}

	public String getEmployeeDetails() {
		return this.employeeDetails;
	}

	/**
	 * 
	 * @param name
	 * @param role
	 */
	public void setEmployeeDetails(String name, String role) {
		// TODO - implement StaffAccount.setEmployeeDetails
		throw new UnsupportedOperationException();
	}

	public String getEmployeeJobHistory() {
		return this.employeeJobHistory;
	}

	/**
	 * 
	 * @param employeeJobHistory
	 */
	public void setEmployeeJobHistory(String employeeJobHistory) {
		this.employeeJobHistory = employeeJobHistory;
	}

	public void saveEmployee() {
		// TODO - implement StaffAccount.saveEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param role
	 * @param username
	 */
	public static StaffAccount StaffAccount(String role, String username) {
		// TODO - implement StaffAccount.StaffAccount
		throw new UnsupportedOperationException();
	}

}