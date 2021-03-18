package ro.ase.csie.cts.course4.singleton;

public class UIModule {

	public UIModule() {
//		DBConnection dbConnection = new DBConnection("localhost");
		DBConnection dbConnection = DBConnection.getConnection();
	}

}
