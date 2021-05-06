package crisan.monicadiana.g1092.dp.decorator;

import java.util.ArrayList;
import java.util.List;

public class AdministratorUser extends User{

	public AdministratorUser(String fullName, String email, String passwordString) {
		super(fullName, email, passwordString);
		// TODO Auto-generated constructor stub
	}

	List<String> companyOldPasswords = new ArrayList<>();

	@Override
	public void addProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
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
		companyOldPasswords.add(pass);
		System.out.println("Password stored");
	}
	
	

}
