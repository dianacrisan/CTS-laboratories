package cts.crisan.diana.g1092.pattern.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		IHomeBankProcessor bank1 = new HomeBankTransaction();
		IHomeBankProcessor bank2 = new HomeBankTransaction();
		
		VisaTransaction visaBankTransaction = new VisaTransaction();
		
		bank1.transactionHomeFee("RO11INGB1234543234665432", "RO11BCRE65234AXX34521123", 26.12, "RON");
		bank2.transactionHomeFee("RO78INGB1234543232345611", "RO11BCRE65234AXX34521123", 1232.00, "RON");
		visaBankTransaction.transaction("RO99RZBR1234543234661111", "RO23INGB65234AXX34521123", 100.00, "RON");
		visaBankTransaction.transactionWithCurrencyExchange("RO99RZBR1234543234661111", "EN12INGB65234AXX34521123", 100.00, "RON", "EUR");

		
		Visa2HomeBankAdapter transactionAdapter = new Visa2HomeBankAdapter(visaBankTransaction);
		transactionAdapter.transactionHomeFee("RO12RZBR1234543277665432", "RO11BCRE6576XXXX34521123", 1456.88, "RON");

		bank1.transactionHomeFee("RO78INGB1234543232345611", "RO11INGB1234543234665432", 26.12, "RON");

	}

}
