package cts.crisan.diana.g1092.pattern.factory;

public class BankAccountsFactory {

	public static BankAccount getBankAccount(BankAccountType type, String id, double balance) {
		BankAccount bankAccount = null;
		switch (type) {
		case CREDIT: 
			bankAccount = new CreditBankAccount(balance, id);
			break;
		case DEBIT:
			bankAccount = new DebitBankAccount(balance, id);
			break;
		case JUNIOR:
			bankAccount = new JuniorBankAccount(balance, id);
			break;
		default:
			throw new UnsupportedOperationException("This type is not covered");
		}
		
		return bankAccount;
	}
}
