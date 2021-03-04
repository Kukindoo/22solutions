package Jobs;

public interface I_Jobs {

	abstract Job newJob();

	/**
	 * 
	 * @param taskID
	 */
	abstract Task addTask(int taskID);

	abstract JobHistory getJobs();

	/**
	 * 
	 * @param jobID
	 */
	abstract String getJobStatus(int jobID);

	abstract float getPrice();

	abstract ListOfTasks getTasks();

	/**
	 * 
	 * @param jobID
	 * @param shift
	 */
	abstract boolean saveJob(int jobID, String shift);

	/**
	 * 
	 * @param taskID
	 * @param doneBy
	 */
	abstract boolean saveTask(int taskID, String doneBy);

	/**
	 * 
	 * @param taskID
	 */
	abstract String getTaskStatus(int taskID);

}