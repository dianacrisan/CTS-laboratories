package ro.ase.csie.cts.course4.singleton;

public class StudentModule {
	
	public StudentModule() {
		DBConnection dbConnection = new DBConnection("localhost");
	}

}
