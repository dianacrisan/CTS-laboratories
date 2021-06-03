package ro.ase.csie.cts.assignment3.singleton;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class ServerSingleton implements ServerInterface {

	String iPAddress;
	int port;
	int maxConnections;
	
	private static ServerSingleton instanceServerSingleton = null;
	
	private ServerSingleton () {
		
	}
	
	private ServerSingleton(String iPAddress, int port, int maxConnections) {
		super();
		this.iPAddress = iPAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}

	public static ServerSingleton getServerInstance() {
		if(instanceServerSingleton == null) {
			instanceServerSingleton = new ServerSingleton();
		}
		return ServerSingleton.instanceServerSingleton;
	}
	
	public static ServerSingleton getServerInstance(String ipString, int port, int maxConnections) {
		if(ServerSingleton.instanceServerSingleton == null) {
			instanceServerSingleton = new ServerSingleton(ipString, port, maxConnections);
		}
		if(!ipString.equals(instanceServerSingleton.iPAddress) || port !=instanceServerSingleton.port) {
			throw new UnsupportedOperationException("You already have an opened connection to a different server");
		}
		return ServerSingleton.instanceServerSingleton;
	}

	@Override
	public String getIpAddress() {
		return instanceServerSingleton.iPAddress;
	}

	@Override
	public int getPort() {
		return instanceServerSingleton.port;
	}

	@Override
	public int getMaxConnections() {
		return instanceServerSingleton.maxConnections;
	}

	@Override
	public boolean connect() {
		if(instanceServerSingleton != null) {
			System.out.println("Connection already open");
		}
		else {
			instanceServerSingleton = getServerInstance();
			System.out.println("Connected to server");
		}
		return true;
	}

	@Override
	public boolean disconnect() {
		if(instanceServerSingleton == null) {
			System.out.println("No active connection");
		}
		else {
			instanceServerSingleton = null;
			System.out.println("Disconnected from server");
		}
		return true;
	}
}
