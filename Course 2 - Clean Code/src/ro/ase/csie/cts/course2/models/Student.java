package ro.ase.csie.cts.course2.models;

public class Student {
	
	// kiss (keep it simple and stupid) at class level
	PersonalData personalData;
	Faculty faculty;
	
	int[] grades;
	
	public int getMinGrade() {
		int minimum = this.grades[0];
		for(int grade: this.grades) {
			if(minimum > grade) {
				minimum = grade;
			}
		}
		return minimum;
	}
	
	// bad code examples are comments
	public int getNoMinimumGrades() {
		
// 		wet principle (copy paste wrong code)
/*		int minimum = this.grades[0];
		for(int grade: this.grades) {
			if(minimum > grade) {
				minimum = grade;
		}
*/		
		int minimum = this.getMinGrade(); // this is good
		int noGrades = 0;
		for(int grade : this.grades) {
			if(grade == minimum) {
				noGrades += 1;
			}
		}
		
		return noGrades;
	}
}
