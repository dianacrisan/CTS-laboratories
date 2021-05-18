package cts.crisan.diana.g1092.pattern.adapter;

public class VisaTransaction implements IVisaProcessor {

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		System.out.println("Transaction from " + sourseAccount + " to " + destinationAccount + " of " + value + " " + currency);

	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		System.out.println("Transaction from " + sourseAccount + " to " + destinationAccount + " of " + value);
		System.out.println("Source currency: " + sourseCurrency);
		System.out.println("Destination currency: " +destinationCurrency);
	}

}
