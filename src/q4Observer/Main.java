package q4Observer;

public class Main {
	public static void main(String[] args) {
		// Create manager and workers
		WorkManager manager = new WorkManager();
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		
		// Add workers to manager
		manager.registerWorker(worker1);
		manager.registerWorker(worker2);
		manager.registerWorker(worker3);
		manager.registerWorker(worker4);
		
		// Create work items and notify manager
		WorkItem item1 = new WorkItem("1", 1, "Fix the sink");
		manager.notify(item1);
		
		WorkItem item3 = new WorkItem("3", 3, "Install door knob");
		manager.notify(item3);
		
		WorkItem item4 = new WorkItem("5", 5, "Paint hallway wall");
		manager.notify(item4);
	}
}
