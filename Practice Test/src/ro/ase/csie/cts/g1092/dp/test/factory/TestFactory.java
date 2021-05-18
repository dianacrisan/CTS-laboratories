package ro.ase.csie.cts.g1092.dp.test.factory;

public class TestFactory {

	public static void main(String[] args) {
		IContBancar bankAccount = BankAccountsFactory.getBankAccount("credit");
		bankAccount.deposit(570.00);
		
		IContBancar bankDebitAccount = BankAccountsFactory.getBankAccount("debit");
		bankAccount.transfer(bankAccount, 1000.00);
	}

}
