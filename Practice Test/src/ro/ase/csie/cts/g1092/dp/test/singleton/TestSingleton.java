package ro.ase.csie.cts.g1092.dp.test.singleton;


public class TestSingleton {

	public static void main(String[] args) {
		BankSingleton bankInstance = BankSingleton.getBankInstnce("Raifeisen International", "Bucuresti, strada...");
		BankSingleton bankInstance2 = BankSingleton.getBankInstnce("Raifeisen International", "Mures, strada...");
		
		if(bankInstance == bankInstance2) {
			System.out.println("They are the same instance");
		}

	}

}
