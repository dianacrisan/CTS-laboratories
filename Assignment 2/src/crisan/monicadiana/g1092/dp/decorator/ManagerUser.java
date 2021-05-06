package crisan.monicadiana.g1092.dp.decorator;

public class ManagerUser extends User {
	
	int noSubordinateString;

	public ManagerUser(String fullName, String email, String passwordString, int noSubordinateString) {
		super(fullName, email, passwordString);
		this.noSubordinateString = noSubordinateString;
	}

	@Override
	public void addProjectFile(String fileName) {
		if(this.noSubordinateString > 10) {
			System.out.println("Big project file");
		}
		else {
			System.out.println("Small project file");
		}
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		if(this.noSubordinateString > 10) {
			System.out.println("Big project analysis");
		}
		else {
			System.out.println("Small project analysis");
		}
	}

	@Override
	public void deleteProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPassword(String pass) {
		// TODO Auto-generated method stub
		
	}
	
	
}
