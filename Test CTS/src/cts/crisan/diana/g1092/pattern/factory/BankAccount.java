package cts.crisan.diana.g1092.pattern.factory;


public abstract class BankAccount {
    double balance;
    String id;

    public BankAccount(double Balance, String Id) {
        balance = Balance;
        id = Id;
    }
}