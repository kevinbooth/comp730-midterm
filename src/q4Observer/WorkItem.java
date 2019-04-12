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
	
	public String getItemID() { return itemID; }
	
	public void setItemID(String itemID) { this.itemID = itemID; }
	
	public long getWorkerID() { return workerID; }
	
	public String getMessage() { return message; }
}
