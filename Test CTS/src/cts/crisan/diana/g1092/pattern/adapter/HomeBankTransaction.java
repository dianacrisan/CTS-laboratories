package cts.crisan.diana.g1092.pattern.adapter;

public class HomeBankTransaction implements IHomeBankProcessor {

	@Override
	public void transactionHomeFee(String sourseAccount, String destinationAccount, double value, String currency) {
		System.out.println("Transaction from " + sourseAccount + " to " + destinationAccount + " of " + value + " " + currency);
	}

}
