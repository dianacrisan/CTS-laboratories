package ro.ase.csie.cts.course3.entities;

public class Student {
	//boolean noScholarship;
	boolean hasScholarship;
	boolean isEnrolled;
	int age;
	int enrollmentYear;
	float typingFrequency;
	
	void payTax() {} 		// depends on accounting	
	void takeOOPExam() {}	// depends on the professor
	void saveToDB() {}		// depends on the DB administrator
	
	void incrementAge() {
//		if(this.age < 20) {
//			this.age += 1;
//		}
//		else {
//			this.age += 2;
//		}
		
		// for simple if-then-else, use the ternary operator
		this.age = (this.age < 20) ? (this.age += 1) : (this.age += 2);
	}
	
	String getInfo() {
		String message;
		
		// test for false
		if(this.hasScholarship == false) {
			// do something
			message = "something";
			return message;
		}
		
		// test for true
		if(this.hasScholarship == true) {
			return "The student has a scholarship";
		}
		else {
			return "No scholarship";
		}
	}
	
	public int aSimpleFunction() {
		return 10;
	}
}
