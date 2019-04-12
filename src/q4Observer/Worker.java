package q4Observer;

public class Worker {
	private long workerID;
	
	public Worker(long workerID) {
		this.workerID = workerID;
	}
	
	public String notify(WorkItem i) {
		if (i.getItemID() == Long.toString(workerID)) {
			return "Worker" + 
					workerID +  
					"processed WorkItem" +  
					"message" +
					i.getMessage();
		}
		return null;
	}
}
