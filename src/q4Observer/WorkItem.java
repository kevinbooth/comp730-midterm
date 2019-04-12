package q4Observer;

public class WorkItem {
	String itemID;
	long workerID;
	String message;
	
	public WorkItem(String itemID, long workerID, String message) {
		this.itemID = itemID;
		this.workerID = workerID;
		this.message = message;
	}
}
