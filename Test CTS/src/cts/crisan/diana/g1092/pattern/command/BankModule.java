package cts.crisan.diana.g1092.pattern.command;

public abstract class BankModule {
    public abstract void processTransaction(String sourseAccount, String destinationAccount, double value,
            String destinationBank);
}