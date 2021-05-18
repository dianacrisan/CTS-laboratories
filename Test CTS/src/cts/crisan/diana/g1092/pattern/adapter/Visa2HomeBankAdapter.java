package cts.crisan.diana.g1092.pattern.adapter;

public class Visa2HomeBankAdapter implements IHomeBankProcessor {
	
	IVisaProcessor visaProcessor = null;

	public Visa2HomeBankAdapter(IVisaProcessor visaProcessor) {
		super();
		this.visaProcessor = visaProcessor;
	}

	@Override
	public void transactionHomeFee(String sourseAccount, String destinationAccount, double value, String currency) {
		this.visaProcessor.transaction(sourseAccount, destinationAccount, value, currency);
		System.out.println("transaction of " + value + " (VISA processor adapted to HOME Bank processor)");
	}
	
	
}
