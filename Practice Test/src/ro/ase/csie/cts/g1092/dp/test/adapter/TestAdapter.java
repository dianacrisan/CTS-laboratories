package ro.ase.csie.cts.g1092.dp.test.adapter;

import ro.ase.csie.cts.g1092.dp.test.factory.BankAccountsFactory;
import ro.ase.csie.cts.g1092.dp.test.factory.IContBancar;

public class TestAdapter {

	public static void main(String[] args) {

		IContBancar contBancarCredit = BankAccountsFactory.getBankAccount("credit");
		IContBancar contBancarDebit = BankAccountsFactory.getBankAccount("debit");
		
		FutureBankAccount futureBankAccount = new FutureBankAccount();
		
		ACME2FutureBankAdapter accountAdapter = new ACME2FutureBankAdapter(contBancarCredit);
		accountAdapter.accountTransfer(futureBankAccount, 230);

	}

}
