package ro.ase.csie.cts.g1092.testing.tests;

import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class TestStudent {

	// test fixture
    static Student student;
    static ArrayList<Integer> grades;
    static String initialName;
    static int initialAge;

    @BeforeClass // only once
    public static void beforeClass() throws Exception {
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "John";
        initialAge = 21;
    }

    @AfterClass // only once
    public static void tearDownAfterClass() throws Exception {
    	grades.clear();
    	grades=null;

    }

    @Before // each unit test
    public void setUp() throws Exception {
    	student = new Student(initialName, initialAge, grades);
    }

    @After // each unit test
    public void tearDown() throws Exception {
    	student = null;
    }

    @Ignore
    @Test
    public void test() {
        fail("not implemented");
    }

    @Test
    public void testSetNameRightValues() throws WrongNameException {


        String newName = "Alice";
        // when you don't expect an exception you may throw it further
        student.setName(newName);

        assertEquals("Testing with proper name", newName, student.getName());
    }

    @Test
    public void setAgeRightValues() {
    	int newAge = initialAge +1;
    	try {
			student.setAge(newAge);
			assertEquals("Testing for proper age value", newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception when that was not expected");
		}
    	
    	
    }
}