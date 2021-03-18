package ro.ase.csie.cts.course4;

public class Student {
	String name;
	int age;
	String faculty;

	// using DIP
	ExamInterface exam = new OralExam();
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	// changing the exam format - method 2
	public Student(String name, ExamInterface exam) {
		if(exam == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.exam = exam;
	}

	// changing the exam format - method 2
	public void setExam(ExamInterface exam) {
		if(exam == null) {
			throw new NullPointerException();
		}
		
		this.exam = exam;
	}

	public void takeExam(String course) {
		// strong dependency on specific exam format, not OK
		// System.out.println(String.format("%s takes a quiz exam at %s", this.name, course));
	
		if(exam == null) {
			throw new UnsupportedOperationException();
		}
		
		// callback
		this.exam.takeExam(course, this.name);
	}
}
