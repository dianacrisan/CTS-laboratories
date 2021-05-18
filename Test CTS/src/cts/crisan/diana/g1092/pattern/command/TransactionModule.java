package cts.crisan.diana.g1092.pattern.command;

public class TransactionModule extends BankModule {

	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {
		System.out.println(sourseAccount + " sent " + value + " to the acount: " + destinationAccount);
		System.out.println("Transaction arriving to the bank: "+ destinationBank);

	}

}
