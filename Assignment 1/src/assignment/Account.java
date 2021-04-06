package assignment;

import assignment.exceptions.InvalidValueException;
import assignment.interfaces.RatesInterface;

public class Account implements RatesInterface {
	
	public static final float BROKER_FEE = .0125f;
	public static final float DAYS_IN_A_YEAR = 365;

	private double loanValue, monthlyRate;
	private int daysActive;
	AccountType accountType;
	
	public Account(double loanValue, double monthlyRate, AccountType accountType) throws InvalidValueException {
		if (loanValue < 0) {
			throw new InvalidValueException("Loan value must be a positive number.");
		}
		if (monthlyRate < 0) {
			throw new InvalidValueException("Monthly rate be a positive number.");
		}
		this.loanValue = loanValue;
		this.monthlyRate = monthlyRate;
		this.accountType = accountType;
	}

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public double getMonthlyRate() {
		System.out.println("The rate is " + monthlyRate);
		return this.monthlyRate;
	}

	public void setLoanValue(double loanValue) throws InvalidValueException {
		if (loanValue < 0) {
			throw new InvalidValueException("Loan value must be a positive number.");
		}
		this.loanValue = loanValue;
	}

	public String getAccountDetails() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("ACCOUNT DETAILS");
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("Loan value: ");
		stringBuilder.append(this.loanValue);
		stringBuilder.append("Monthly rate: ");
		stringBuilder.append(this.monthlyRate);
		stringBuilder.append("Days active: ");
		stringBuilder.append(this.daysActive);
		stringBuilder.append("Account type: ");
		stringBuilder.append(this.accountType);
		stringBuilder.append(System.getProperty("line.separator"));
		return stringBuilder.toString();
	}

	public static double getDifferenceBetweenInterestAndPrincipal(Account account) {
		return (account.daysActive / DAYS_IN_A_YEAR) - account.loanValue;
	}
	
	public static double getAccountInterestFee(Account account) {
		return Math.pow(account.monthlyRate, getDifferenceBetweenInterestAndPrincipal(account));
	}
	
	public static double getLoanValueAfterInterestFee(Account account) {
		return account.loanValue * getAccountInterestFee(account);
	}
	
	public static double getAccountFinalFee(Account account) {
		return BROKER_FEE * getLoanValueAfterInterestFee(account);
	}
	
	public static double getPremiumAndSuperPremiumAccountsTotalFeesValue(Account[] accounts) {
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountType == AccountType.PREMIUM || accounts[i].accountType == AccountType.SUPER_PREMIUM) {
				totalFee += getAccountFinalFee(accounts[i]);
			}
		}
		return totalFee;
	}

	@Override
	public double computeMonthlyRate() {
		return this.loanValue * this.monthlyRate;
	}

}