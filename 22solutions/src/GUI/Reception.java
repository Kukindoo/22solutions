package GUI;

import Accounts.*;
import Jobs.*;
import Payment.*;

public class Reception {

	private String customerData;
	private int jobID;
	private int taskID;

	/**
	 * 
	 * @param name
	 * @param email
	 */
	public CustomerAccount createCustomerAccount(String name, String email) {
		// TODO - implement Reception.createCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void searchCustomerAccount(String[1..*] name) {
		// TODO - implement Reception.searchCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public String selectCustomer(String name) {
		// TODO - implement Reception.selectCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public Job newJob(int jobID) {
		// TODO - implement Reception.newJob
		throw new UnsupportedOperationException();
	}

	public String getJobStatus() {
		// TODO - implement Reception.getJobStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 * @param taskDescription
	 */
	public TaskDescription newTask(int taskID, String taskDescription) {
		// TODO - implement Reception.newTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public ListOfTasks searchTasks(int taskID) {
		// TODO - implement Reception.searchTasks
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public String getTaskStatus(int taskID) {
		// TODO - implement Reception.getTaskStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public Payment makePayment(float amount) {
		// TODO - implement Reception.makePayment
		throw new UnsupportedOperationException();
	}

	public boolean selectPaymentMethod() {
		// TODO - implement Reception.selectPaymentMethod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ccData
	 */
	public void submitCardForm(String[] ccData) {
		// TODO - implement Reception.submitCardForm
		throw new UnsupportedOperationException();
	}

	public DB saveJob() {
		// TODO - implement Reception.saveJob
		throw new UnsupportedOperationException();
	}

	public static Reception Reception() {
		// TODO - implement Reception.Reception
		throw new UnsupportedOperationException();
	}

}