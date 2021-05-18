package cts.crisan.diana.g1092;

public abstract class BankModule {
    public abstract void processTransaction(String sourseAccount, String destinationAccount, double value,
            String destinationBank);
}