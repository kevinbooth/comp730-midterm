package q4Observer;

public class Worker implements Observer {
	private long workerID;
	
	public Worker(long workerID) {
		workerID = workerID;
	}
	
	@Override
	public boolean notifyObserver(WorkItem i) {
		return false;
	}
}
