package crisan.monicadiana.g1092.dp.composite;

public class DictionaryDataFile implements ProjectFile {
	private String name;
	private Integer noWords;
	private Integer noBytes;
	
	@Override
	public void printProjectName() {
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoWords() {
		return noWords;
	}

	public void setNoWords(Integer noWords) {
		this.noWords = noWords;
	}

	public Integer getNoBytes() {
		return noBytes;
	}

	public void setNoBytes(Integer noBytes) {
		this.noBytes = noBytes;
	}

	public DictionaryDataFile(String name, Integer noWords, Integer noBytes) {
		super();
		this.name = name;
		this.noWords = noWords;
		this.noBytes = noBytes;
	}

	
}
