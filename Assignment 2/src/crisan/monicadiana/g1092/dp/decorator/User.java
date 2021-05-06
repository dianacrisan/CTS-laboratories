package crisan.monicadiana.g1092.dp.decorator;

public abstract class User {
	String fullName;
	String email;
	String passwordString;
	
	public User(String fullName, String email, String passwordString) {
		this.fullName = fullName;
		this.email = email;
		this.passwordString = passwordString;
	}
	
	public abstract void addProjectFile(String fileName);
	
	public abstract void dataAnalysisOnProjectFile(String fileName);
	
	public abstract void deleteProjectFile(String fileName);
	
	public abstract void modifyName(String name);
	
	public abstract void modifyPassword(String pass);
}