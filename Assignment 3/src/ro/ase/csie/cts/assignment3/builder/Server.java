package ro.ase.csie.cts.assignment3.builder;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class Server implements ServerInterface {
	
	String ipAddress;
	int port;
	int maxConnections;
	
	int intervalSeconds;
	int requestRate;
	int kilobytesRate;
	
	String status;
	String name;
	String configuration;
	
	boolean isFreeHosting;
	
	private Server() {
	
	}

	@Override
	public String getIpAddress() {
		return this.ipAddress;
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
	
	public static class ServerBuilder {
		
		Server server = null;
		
		public ServerBuilder(String ipAddress, int port) {
			this.server = new Server();
			this.server.ipAddress = ipAddress;
			this.server.port = port;
		}
		
		public ServerBuilder setMaxConnections (int maxConnections) {
			this.server.maxConnections = maxConnections;
			return this;
		}
		
		public ServerBuilder setIntervalSeconds (int intervalSec) {
			this.server.intervalSeconds = intervalSec;
			return this;
		}
		
		public ServerBuilder setRequestRate (int requestRate) {
			this.server.requestRate = requestRate;
			return this;
		}
		
		public ServerBuilder setKilobytesRate (int kbRate) {
			this.server.kilobytesRate = kbRate;
			return this;
		}
		
		public ServerBuilder setStatus (String status) {
			this.server.status = status;
			return this;
		}
		
		public ServerBuilder setConfiguration (String config) {
			this.server.configuration = config;
			return this;
		}
		
		public ServerBuilder setName (String name) {
			this.server.name = name;
			return this;
		}
		
		public ServerBuilder isFreeHosting () {
			this.server.isFreeHosting = true;
			return this;
		}
		
		public Server build() {
			return this.server;
		}
	}

	

}

