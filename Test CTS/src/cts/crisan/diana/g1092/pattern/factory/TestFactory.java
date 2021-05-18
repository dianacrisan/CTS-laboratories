package cts.crisan.diana.g1092.pattern.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = BankAccountsFactory.getBankAccount(BankAccountType.DEBIT, "0001", 2000);
		BankAccount bankAccount2 = BankAccountsFactory.getBankAccount(BankAccountType.DEBIT, "0002", 1500);
		BankAccount bankAccount3 = BankAccountsFactory.getBankAccount(BankAccountType.JUNIOR, "0003", 350);
		BankAccount bankAccount4 = BankAccountsFactory.getBankAccount(BankAccountType.CREDIT, "0004", 7390.65);
		
		

	}
}
