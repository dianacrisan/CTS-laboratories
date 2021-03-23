package ro.ase.csie.cts.lab5.dp.singleton;

public class DBConnection {
	String socket;
	String schema;
	
	// version 1 - eager approach: create singleton when class loaded (not that good)
	// private static DBConnection dbConnection = new DBConnection();
	
	// version 2 - lazy approach
	private static DBConnection dbConnection = null;
	
	// class static initializer
	// uses the class lazy-loading approach
	static {
		// executed only once when the class is loaded by the JVM
		System.out.println("Loading database connection string");
	}
	
	// constructor initializer
	{
		// executed before each constructor call
		System.out.println("Init connection string");
	}
	            
	private DBConnection() {
		System.out.println("Creating a DB connection");
		
		// access a local settings file to get credentials and connection string
		// ...
	}

	private DBConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	// the method used to return the reference to the unique object - singleton
	// is using default/application settings values
	public static DBConnection getDBConnection() {
		if(DBConnection.dbConnection == null) {
			// you can get details from files, etc
			dbConnection = new DBConnection();
		}
		return DBConnection.dbConnection;
	}
	
	public static DBConnection getDBConnection(String socket, String schema) {
		if(DBConnection.dbConnection == null) {
			dbConnection = new DBConnection(socket, schema);
		}
		// optional = throw an error if they try to open a connection to a different database
		if(!socket.equals(dbConnection.socket) || !schema.equals(dbConnection.schema)) {
			throw new UnsupportedOperationException("You already have an opened connection to a different database");
		}
		return DBConnection.dbConnection;
	}
}
