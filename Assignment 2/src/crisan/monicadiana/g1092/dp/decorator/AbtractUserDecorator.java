package crisan.monicadiana.g1092.dp.decorator;

public abstract class AbtractUserDecorator extends User {

	User decoratedObject;
	
	public AbtractUserDecorator(User decoratedObject) {
		super(decoratedObject.fullName, decoratedObject.email, decoratedObject.passwordString);
		this.decoratedObject = decoratedObject;
	}

	@Override
	public void addProjectFile(String fileName) {
		this.decoratedObject.addProjectFile(fileName);	
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		this.decoratedObject.dataAnalysisOnProjectFile(fileName);
	}

	@Override
	public void deleteProjectFile(String fileName) {
		this.decoratedObject.deleteProjectFile(fileName);
	}

	@Override
	public void modifyName(String name) {
		this.decoratedObject.modifyName(name);
	}

	@Override
	public void modifyPassword(String pass) {
		this.decoratedObject.modifyPassword(pass);
	}
	
	
}
