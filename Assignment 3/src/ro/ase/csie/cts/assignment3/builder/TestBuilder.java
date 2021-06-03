package ro.ase.csie.cts.assignment3.builder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBuilder {

	Server server1;

	@Before
	public void setUp() throws Exception {
		server1 = new Server.ServerBuilder("5.14.23.11", 4)
				.setStatus("up")
				.isFreeHosting()
				.setRequestRate(95)
				.build();
	}

	@After
	public void tearDown() throws Exception {
		server1 = null;
	}

	@Test
	public void testMaxConnectionsNotImplemented() {
		int unimplementesMaxCon = 3;
		assertNotEquals(server1.maxConnections, unimplementesMaxCon);
	}
	
	@Test
	public void testBuilderStatus() {
		String expectedStatus = "up";
		assertEquals(expectedStatus, server1.status);
	}

}
