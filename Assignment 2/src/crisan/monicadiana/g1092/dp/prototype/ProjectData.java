package crisan.monicadiana.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class ProjectData implements Cloneable {
	
	String fileName;
	int noColumns;
	ArrayList<Integer> categories = null;

	public ProjectData(String fileName, int noColumns) {

		System.out.println("File on web app");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.categories = new ArrayList<>();
		this.fileName = fileName;
		this.noColumns = noColumns;
	}

	private ProjectData() {
		super();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ProjectData copy = new ProjectData();
		copy.fileName = this.fileName;
		copy.noColumns = this.noColumns;
		copy.categories = (ArrayList<Integer>) this.categories.clone(); 
		
		return copy;
	}

	@Override
	public String toString() {
		return "ProjectData [fileName=" + fileName + ", noColumns=" + noColumns + ", categories=" + categories + "]";
	}

}
