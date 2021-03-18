package ro.ase.csie.cts.course4.singleton;

public class DBConnection {
	
	private static DBConnection theConnection = null;
	
	String serverName;
	String userAccount;
	String password;
	
	// singleton
	// instead of saying = new DBConnection("localhost") at line 5
	// class static constructor - constructor initializer
	// executed only once! (when JVM loads the class)
	static {
		System.out.println("initializing the unique connection.");
		theConnection = new DBConnection("10.01.1.10");
	}
	
	// everybody can get this connection, but cannot create another one => singleton
	public static DBConnection getConnection() {
		return theConnection;
	}
	
	private DBConnection(String serverName) {
		this.serverName = serverName;
		System.out.println("Creating a DB connection to ");
	}
	
	// others can make other DBConnection objects using a public constructor
	// NOT SINGLETON! => every constructor must be private
	private DBConnection(String serverName, String userAccount, String password) {
		this.serverName = serverName;
		this.userAccount = userAccount;
		this.password = password;
	}

	public void connect() {
		System.out.println("Connecting...");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting...");
	}
	
	public void sendSQLCommand() {
		System.out.println("Doing a SELECT");
	}
}
