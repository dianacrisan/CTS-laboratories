package crisan.monicadiana.g1092;

import crisan.monicadiana.g1092.dp.composite.AbstractProjectFile;
import crisan.monicadiana.g1092.dp.composite.DictionaryDataFile;
import crisan.monicadiana.g1092.dp.composite.NumericProjectFile;
import crisan.monicadiana.g1092.dp.composite.ProjectFile;
import crisan.monicadiana.g1092.dp.decorator.AdministratorUser;
import crisan.monicadiana.g1092.dp.decorator.ManagerUser;
import crisan.monicadiana.g1092.dp.decorator.User;
import crisan.monicadiana.g1092.dp.prototype.ProjectData;
import crisan.monicadiana.g1092.dp.registry.RegistryLogger;
import crisan.monicadiana.g1092.dp.singleton.Logger;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {
		// SINGLETON
		Logger.getInstance().log("Singleton implementation");
		
		// SINGLETON REGISTRY
		RegistryLogger registryLogger1 = RegistryLogger.getInstancesLoggers("file1");
		RegistryLogger registryLogger2 = RegistryLogger.getInstancesLoggers("file2");
		RegistryLogger registryLogger3 = RegistryLogger.getInstancesLoggers("file1");
		
		if(registryLogger1 == registryLogger3) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are different");
		}
		
		if(registryLogger1 == registryLogger2) {
			System.out.println("They are the same object");
		}
		else {
			System.out.println("They are different");
		}
		
		// DECORATOR
		User user = new ManagerUser("Diana Crisan", "crisan.diana00@yahoo.com", "pass", 14);
		user.dataAnalysisOnProjectFile("regression2021");
		
		AdministratorUser administratorUser = new AdministratorUser("Admin Admin", "admin@yahoo.com", "pass2");
		administratorUser.modifyPassword("pass3");
		
		// COMPOSITE
		ProjectFile file1 = new NumericProjectFile("File1.csv", 234, 2);
		ProjectFile file2= new DictionaryDataFile("File2.xml", 765, 1500);
		ProjectFile file3 = new NumericProjectFile("File3.csv", 688, 4);
		AbstractProjectFile pFile = new AbstractProjectFile(2000, "APF");
		
		pFile.addProjectFile(file1);
		pFile.addProjectFile(file2);
		pFile.addProjectFile(file3);

		System.out.println(pFile.getProjectFile(1).getName());
		
		// PROTOTYPE
		ProjectData pd1 = new ProjectData("regression.csv", 13);
		ProjectData pd2 = (ProjectData) pd1.clone(); // deep copy
		pd1.toString();
		pd2.toString();
	}

}
