package cts.crisan.diana.g1092.pattern.command;

public class AsyncCommand extends AsyncTask {

	String destinationBank;
	String destinationAccount;
	String sourceAccount;
	double amount;
	BankModule module = null;
	
	public AsyncCommand(String destinationBank, String destinationAccount, String sourceAccount, double amount,
			BankModule module) {
		super();
		this.destinationBank = destinationBank;
		this.destinationAccount = destinationAccount;
		this.sourceAccount = sourceAccount;
		this.amount = amount;
		this.module = module;
	}

	@Override
	public void asyncExecute() {
		this.module.processTransaction(sourceAccount, destinationAccount, amount, destinationBank);
	}

	@Override
	public String getNameOfDestinationBank() {
		return this.destinationBank;
	}

}
