package q4Observer;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Worker> workers = new ArrayList<Worker>();
	
	public WorkManager() {}
	
	public void registerWorker(Worker w) {
		workers.add(w);
	}
	
	public void removeWorker(Worker w) {
		workers.remove(w);
	}
	
	public void notifyManager(WorkItem i) {
		notify(i);
	}
	
	public void notify(WorkItem i) {
		for (Worker w : workers) {
			w.notify(i);
		}
	}
}
