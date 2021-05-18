package cts.crisan.diana.g1092.pattern.factory;

public class DebitBankAccount extends BankAccount {

	boolean isSalaryCollected;
	boolean isOverdraftOptionActivated;
	
	public DebitBankAccount(double Balance, String Id) {
		super(Balance, Id);
		this.isSalaryCollected = false;
		this.isOverdraftOptionActivated = false;
	}

	
}
