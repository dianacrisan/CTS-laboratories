package ro.ase.csie.cts.course4;

public class OralExam implements ExamInterface {

	@Override
	public void takeExam(String course, String studentName) {
		System.out.println(String.format("%s takes an oral exam at %s", studentName, course));
	}

}
