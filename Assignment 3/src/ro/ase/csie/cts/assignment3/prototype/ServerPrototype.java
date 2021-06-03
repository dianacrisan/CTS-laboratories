package ro.ase.csie.cts.assignment3.prototype;

import java.util.ArrayList;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class ServerPrototype implements ServerInterface {

	String iPAddress;
	int port;
	int maxConnections;
	
	private ServerPrototype() {
		
	}
	
	public ServerPrototype(String iPAddress, int port, int maxConnections) {
		super();
		this.iPAddress = iPAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ServerPrototype copy = new ServerPrototype();
		copy.iPAddress = this.iPAddress;
		copy.port = this.port;
		copy.maxConnections = this.maxConnections; 
		return copy;
	}

	@Override
	public String getIpAddress() {
		return this.iPAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		System.out.println("Connected to server");
		return true;
	}

	@Override
	public boolean disconnect() {
		System.out.println("Disconnected from server");
		return true;
	}
}
