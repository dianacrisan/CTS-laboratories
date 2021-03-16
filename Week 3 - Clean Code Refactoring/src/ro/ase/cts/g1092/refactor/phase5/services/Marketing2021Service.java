package ro.ase.cts.g1092.refactor.phase5.services;

import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class Marketing2021Service implements MarketingStrategyInterface {

	// if we know that for each year, the discounts change, then
	// they should be implemented here and not in the interface
	
	@Override
	public float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	}

}
