package ro.ase.csie.cts.assignment3.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestSingleton {

	ServerSingleton instance1;
	ServerSingleton instance2;
	ServerSingleton instance3;
	
	@Before
	public void setUp() throws Exception {
		instance1 = ServerSingleton.getServerInstance();
		instance2 = ServerSingleton.getServerInstance();
	}

	@After
	public void tearDown() throws Exception {
		instance1.disconnect();
		instance2.disconnect();
	}

	@Test
	public void testSingletonConnection() {
		if(instance1 != instance2) {
			fail("Singleton should not have multiple instances");
		}
	}
	
	@Test
	public void testNewConnection() {
		try {
			instance3 = ServerSingleton.getServerInstance("5.16.43.09", 14, 10);
			fail("Cannot have multiple singleton instances");
		}
		catch (UnsupportedOperationException exception){
			assertTrue(true);
		}
		assertNotEquals(instance1, instance3);
	}
	
	@Test
	public void testReturnedIpAddress() {
		instance1.disconnect();
		instance2.disconnect();
		ServerSingleton instance4 = ServerSingleton.getServerInstance("5.16.43.09", 14, 10);
		String expectedIP = "5.16.43.09";
		String actualIP =instance4.getIpAddress();
		
		assertEquals("Testing the return of IP address", expectedIP, actualIP);

	}

}
