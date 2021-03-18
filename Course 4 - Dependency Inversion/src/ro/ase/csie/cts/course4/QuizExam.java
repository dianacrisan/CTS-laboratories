package ro.ase.csie.cts.course4;

public class QuizExam implements ExamInterface {

	@Override
	public void takeExam(String course, String studentName) {
		System.out.println(String.format("%s takes a quiz exam at %s", studentName, course));
	}

}
