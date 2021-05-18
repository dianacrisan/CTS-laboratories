package ro.ase.csie.cts.g1092.dp.test.singleton;

public class BankSingleton {
	
	String name;
	String address;
	int currentAccountNumber;
	
	private static BankSingleton bankInstance = null;

	private BankSingleton(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public static BankSingleton getBankInstnce(String name, String address) {
		if(BankSingleton.bankInstance == null) {
			bankInstance = new BankSingleton(name, address);
		}
		return BankSingleton.bankInstance;
	}
	
}
