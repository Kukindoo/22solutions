package Jobs;

import java.util.*;

public class Job {

	Collection<SQLJobHelper> sql_helper;
	private int priority;
	private Timestamp deadline;
	private String status;
	private String specialInstructions;
	private int jobID;
	SQLJobHelper sqlHelper;
	private int taskID;

	/**
	 * 
	 * @param taskID
	 */
	public boolean removeTask(int taskID) {
		// TODO - implement Job.removeTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 * @param TaskData
	 */
	public boolean updateTask(int taskID, String TaskData) {
		// TODO - implement Job.updateTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public String retrieveTask(int taskID) {
		// TODO - implement Job.retrieveTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public boolean setCurrentOperation(int taskID) {
		// TODO - implement Job.setCurrentOperation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskID
	 */
	public String inspectTask(int taskID) {
		// TODO - implement Job.inspectTask
		throw new UnsupportedOperationException();
	}

	public Timestamp computeDeadline() {
		// TODO - implement Job.computeDeadline
		throw new UnsupportedOperationException();
	}

	public String getJobStatus() {
		// TODO - implement Job.getJobStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param setStatus
	 */
	public void updateStatus(Task setStatus) {
		// TODO - implement Job.updateStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public boolean saveJob(int jobID) {
		// TODO - implement Job.saveJob
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param alertType
	 */
	public Alert alert(String alertType) {
		// TODO - implement Job.alert
		throw new UnsupportedOperationException();
	}

	public float calculatePrice() {
		// TODO - implement Job.calculatePrice
		throw new UnsupportedOperationException();
	}

	public int getJobID() {
		return this.jobID;
	}

	/**
	 * 
	 * @param jobID
	 */
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public int getTaskID() {
		return this.taskID;
	}

	/**
	 * 
	 * @param taskID
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	/**
	 * 
	 * @param taskID
	 */
	public String addTask(int taskID) {
		// TODO - implement Job.addTask
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobData
	 */
	public static Job Job(String jobData) {
		// TODO - implement Job.Job
		throw new UnsupportedOperationException();
	}

}