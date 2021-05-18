package ro.ase.csie.cts.g1092.dp.test.factory;

public class CreditBankAccount implements IContBancar {

	double availableFunds;;
	
	@Override
	public void transfer(IContBancar destination, double amount) {
		System.out.println(amount + " transfered to " + destination);
		this.availableFunds -= amount;
	}

	@Override
	public void deposit(double amount) {
		System.out.println(amount + " has been deposited in the bank account");
		this.availableFunds += amount;
	}

}
