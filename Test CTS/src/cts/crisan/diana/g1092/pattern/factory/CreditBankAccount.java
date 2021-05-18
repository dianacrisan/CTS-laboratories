package cts.crisan.diana.g1092.pattern.factory;

public class CreditBankAccount extends BankAccount {

	int noInstallments;
	double creditLimit;
	
	public CreditBankAccount(double Balance, String Id) {
		super(Balance, Id);
		this.noInstallments = 0;
		this.creditLimit = Balance*5;
	}

}
