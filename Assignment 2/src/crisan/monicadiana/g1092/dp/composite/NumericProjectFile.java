package crisan.monicadiana.g1092.dp.composite;

public class NumericProjectFile implements ProjectFile {
	private String name;
	private Integer noBytes;
	private Integer noCategories;
	
	@Override
	public void printProjectName() {
		System.out.println(this.name);
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoBytes() {
		return noBytes;
	}

	public void setNoBytes(Integer noBytes) {
		this.noBytes = noBytes;
	}

	public Integer getNoCategories() {
		return noCategories;
	}

	public void setNoCategories(Integer noCategories) {
		this.noCategories = noCategories;
	}

	public NumericProjectFile(String name, Integer noBytes, Integer noCategories) {
		super();
		this.name = name;
		this.noBytes = noBytes;
		this.noCategories = noCategories;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	
}
