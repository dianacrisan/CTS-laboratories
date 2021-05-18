package ro.ase.csie.cts.g1092.dp.test.adapter;

import ro.ase.csie.cts.g1092.dp.test.factory.IContBancar;

public class ACME2FutureBankAdapter implements IBankAccount {

	IContBancar ACMEBankAccount = null;
	
	public ACME2FutureBankAdapter(IContBancar aCMEBankAccount) {
		super();
		this.ACMEBankAccount = aCMEBankAccount;
	}

	@Override
	public void accountTransfer(IBankAccount account, double amount) {
		this.ACMEBankAccount.transfer(ACMEBankAccount, amount);
		System.out.println("Adaptded account bank transfer of "+ amount+ " to "+account);
	}

}
