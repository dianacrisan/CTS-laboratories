package ro.ase.csie.cts.course4.singleton;

public class DBConnection {
	String serverName;
	String userAccount;
	String password;
	
	private DBConnection(String serverName) {
		this.serverName = serverName;
		System.out.println("Creating a DB connection to ");
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
