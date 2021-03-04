package Jobs;

public class Task {

	private String status;
	private int duration;
	private String shift;

	/**
	 * 
	 * @param taskData
	 */
	public static Task Task(String taskData) {
		// TODO - implement Task.Task
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employeeName
	 */
	public String doneBy(String employeeName) {
		// TODO - implement Task.doneBy
		throw new UnsupportedOperationException();
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getShift() {
		return this.shift;
	}

	/**
	 * 
	 * @param shift
	 */
	public void setShift(String shift) {
		this.shift = shift;
	}

}