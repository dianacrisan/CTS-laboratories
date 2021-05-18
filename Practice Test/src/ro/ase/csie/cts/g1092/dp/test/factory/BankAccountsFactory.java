package ro.ase.csie.cts.g1092.dp.test.factory;

public class BankAccountsFactory {

	// here we could use enum instead of String
	public static IContBancar getBankAccount(String type) {
		IContBancar bankAccount = null;
		switch (type) {
		case "credit": // or enum CREDIT
			bankAccount = new CreditBankAccount();
			break;
		case "debit":
			bankAccount = new DebitBankAccount();
			break;
		default:
			throw new UnsupportedOperationException("This type is not covered");
		}
		
		return bankAccount;
	}
}
