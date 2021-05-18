package cts.crisan.diana.g1092.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	List<AsyncTask> tasks = new ArrayList<>();

	public void addAsyncTask(AsyncTask task) {
		tasks.add(task);
	}

	public void executeTask() {
		
		boolean isPriority = false; 
		
		 for(AsyncTask task : tasks) {
			 if(task.getNameOfDestinationBank().toLowerCase().contains("Home Bank")) {
				 isPriority = true;
				 task.asyncExecute();
				 tasks.remove(task);
				 break;
			 }
		 }
		 
		 if(isPriority == false){
			 if (tasks.size() > 0) {
					AsyncTask taskToExecute = tasks.get(0);
					if (taskToExecute != null) {
						tasks.remove(0);
						taskToExecute.asyncExecute();
					}
				}
		 }
	
	}
}
