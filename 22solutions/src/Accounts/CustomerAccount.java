package Accounts;

import Jobs.*;
import Payment.*;

public class CustomerAccount extends Accounts {

	private boolean valuedCustStatus;
	private String jobHistory;
	private String discounts;

	public String getDiscounts() {
		return this.discounts;
	}

	/**
	 * 
	 * @param discounts
	 */
	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}

	public Job newJob() {
		// TODO - implement CustomerAccount.newJob
		throw new UnsupportedOperationException();
	}

	public void addTask() {
		// TODO - implement CustomerAccount.addTask
		throw new UnsupportedOperationException();
	}

	public Payment makePayment() {
		// TODO - implement CustomerAccount.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param email
	 */
	public static CustomerAccount newAccount(String name, String email) {
		// TODO - implement CustomerAccount.newAccount
		throw new UnsupportedOperationException();
	}

}