package q4Observer;

public class Worker {
	private long workerID;
	
	public Worker(long workerID) {
		this.workerID = workerID;
	}
	
	public long getWorkerID() { return workerID; }
	
	public String notify(WorkItem i) {
		if (i.getItemID().equals(Long.toString(workerID))) {
			String message = "Worker " + 
							workerID +  
							" processed WorkItem " +
							i.getItemID() +
							" message " +
							i.getMessage();
			// Increment itemID
			int itemID = Integer.parseInt(i.getItemID()) + 1;
			i.setItemID(Integer.toString((itemID)));
			
			return message;
		}
		return null;
	}
}
