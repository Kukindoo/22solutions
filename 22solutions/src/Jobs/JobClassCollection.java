package Jobs;

public class JobClassCollection {

	private int index = 0;

	/**
	 * 
	 * @param priority
	 * @param deadline
	 * @param jobID
	 */
	public Job addItem(String priority, Timestamp deadline, int jobID) {
		// TODO - implement JobClassCollection.addItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public boolean removeItem(int jobID) {
		// TODO - implement JobClassCollection.removeItem
		throw new UnsupportedOperationException();
	}

	public Job getNextItem() {
		// TODO - implement JobClassCollection.getNextItem
		throw new UnsupportedOperationException();
	}

	public int getIndex() {
		return this.index;
	}

	/**
	 * 
	 * @param setIndex
	 */
	public void setIndex(int setIndex) {
		this.index = setIndex;
	}

	public static JobClassCollection JobClassCollection() {
		// TODO - implement JobClassCollection.JobClassCollection
		throw new UnsupportedOperationException();
	}

}