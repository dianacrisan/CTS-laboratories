package ro.ase.csie.cts.lab5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("The app started");
		
		// we must not be able to create multiple objects!
		// DBConnection connection1 = new DBConnection();
		// DBConnection connection2 = new DBConnection();
		
		// these are references to the same object
		DBConnection con1 = DBConnection.getDBConnection();
		DBConnection con2 = DBConnection.getDBConnection();
		DBConnection con3 = DBConnection.getDBConnection();

		// test
		if(con1 == con2 && con2 == con3) {
			System.out.println("They are referencing the same object");
		}
		
		// having both versions of getDBConnection() is not OK, not clean code
		DBConnection con4 = DBConnection.getDBConnection("10.0.0.1:3306","ctsDB");
		
		// test
		if(con1 == con4) {
			System.out.println("They are referencing the same object");
		}
		
		// you still get the initial connection, same object as con4 and others
		DBConnection con5 = DBConnection.getDBConnection("10.0.0.1:3306","cts_prod");
		
	}
	
}
