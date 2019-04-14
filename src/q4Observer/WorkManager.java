package q4Observer;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Worker> workers = new ArrayList<Worker>();
	
	public WorkManager() {}
	
	public void registerWorker(Worker w) { workers.add(w); }
	
	public void removeWorker(Worker w) { workers.remove(w); }
	
	public void notify(WorkItem i) {
		for (Worker w : workers) {
			if (w.getWorkerID() <= 4) {
				String result = w.notify(i);
				
				if (result != null) {
					System.out.println(result);
				}
			}
		}
	}
}
