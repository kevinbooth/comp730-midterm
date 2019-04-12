package q4Observer;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Observer> workers = new ArrayList<Observer>();
	
	public WorkManager() {}
	
	public void registerWorker(Observer w) {
		workers.add(w);
	}
	
	public void removeWorker(Observer w) {
		workers.remove(w);
	}
	
	public void notifyWorker(WorkItem i) {
		for (Observer w : workers) {
			w.notifyObserver(i);
		}
	}
	
	public void notifyManager(WorkItem i) {
		
	}
}
