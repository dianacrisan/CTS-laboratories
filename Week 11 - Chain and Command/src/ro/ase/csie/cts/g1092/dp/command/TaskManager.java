package ro.ase.csie.cts.g1092.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	List<AsyncTask> tasks = new ArrayList<>();

	public void addAsyncTask(AsyncTask task) {
		tasks.add(task);
	}

	public void execute() {
		// priority based execution may be implemented here
		// here another thread should be created to execute using multi-threading
		// queue type implementation, simulated on the same thread
		if (tasks.size() > 0) {
			AsyncTask taskToExecute = tasks.get(0);
			if (taskToExecute != null) {
				tasks.remove(0);
				taskToExecute.asyncExecute();
			}
		}
	}
}
