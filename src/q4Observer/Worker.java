package q4Observer;

public class Worker implements Observer {
	@Override
	public boolean notifyObserver(WorkItem i) {
		return false;
	}
}
