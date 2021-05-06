package ro.ase.csie.cts.g1092.dp.strategy;

public interface BonusStrategyInterface {

	// if the strategy needs to access the class data, then it must be passed as reference
	public void getBonusPoints(int points, Player player);
}
