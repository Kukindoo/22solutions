package Control;

import Accounts.*;
import Jobs.*;
import Payment.*;

public class ReceptionControl {

	private String customerData;
	private int jobID;
	private int taskID;

	/**
	 * 
	 * @param name
	 */
	public CustomerAccount searchCustomerAccount(String[1..*] name) {
		// TODO - implement ReceptionControl.searchCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param custData
	 */
	public CustomerAccount createCustomerAccount(String custData) {
		// TODO - implement ReceptionControl.createCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public Job newJob(int jobID) {
		// TODO - implement ReceptionControl.newJob
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public Job searchJobs(int jobID) {
		// TODO - implement ReceptionControl.searchJobs
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 * @param taskDescription
	 */
	public TaskDescription newTasks(int taskID, String[] taskDescription) {
		// TODO - implement ReceptionControl.newTasks
		throw new UnsupportedOperationException();
	}

	public ListOfTasks searchTasks() {
		// TODO - implement ReceptionControl.searchTasks
		throw new UnsupportedOperationException();
	}

	public boolean saveInvoice() {
		// TODO - implement ReceptionControl.saveInvoice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public String getJobStatus(int jobID) {
		// TODO - implement ReceptionControl.getJobStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public String getTaskStatus(int taskID) {
		// TODO - implement ReceptionControl.getTaskStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public boolean login(String username, char[] password) {
		// TODO - implement ReceptionControl.login
		throw new UnsupportedOperationException();
	}

	public boolean logout() {
		// TODO - implement ReceptionControl.logout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public Payment makePayment(float amount) {
		// TODO - implement ReceptionControl.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 * @param jobID
	 */
	public boolean saveJob(String data, int jobID) {
		// TODO - implement ReceptionControl.saveJob
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public String selectCustomer(String name) {
		// TODO - implement ReceptionControl.selectCustomer
		throw new UnsupportedOperationException();
	}

	public boolean selectPaymentMethod() {
		// TODO - implement ReceptionControl.selectPaymentMethod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ccData
	 */
	public void submitCardForm(String[] ccData) {
		// TODO - implement ReceptionControl.submitCardForm
		throw new UnsupportedOperationException();
	}

	public ReceptionControl ReceptionControl() {
		// TODO - implement ReceptionControl.ReceptionControl
		throw new UnsupportedOperationException();
	}

}