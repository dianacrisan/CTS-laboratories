package ro.ase.csie.cts.g1092.dp.test.factory;

public interface IContBancar {
	public void transfer(IContBancar destination, double amount);
	public void deposit(double amount);
}
