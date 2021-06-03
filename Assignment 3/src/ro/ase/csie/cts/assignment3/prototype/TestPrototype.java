package ro.ase.csie.cts.assignment3.prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrototype {

	ServerPrototype server1;
	ServerPrototype server2;

	@Before
	public void setUp() throws Exception {
		server1 = new ServerPrototype("5.15.32.14", 7, 13);
	}

	@After
	public void tearDown() throws Exception {
		server1 = null;
		server2 = null;
	}

	@Test
	public void testIPAddresses() throws CloneNotSupportedException {
		server2 = (ServerPrototype) server1.clone();
		String expectedIP = "5.15.32.14";
		assertEquals(expectedIP, server1.getIpAddress());
	}

	@Test
	public void testPort() throws CloneNotSupportedException {
		server2 = (ServerPrototype) server1.clone();
		int expectedPort = 7;
		assertEquals(expectedPort, server1.getPort());
	}
	
	@Test
	public void testMaxConnections() throws CloneNotSupportedException {
		server2 = (ServerPrototype) server1.clone();
		int expectedMaxConnections = 13;
		assertEquals(expectedMaxConnections, server1.getMaxConnections());
	}
}
