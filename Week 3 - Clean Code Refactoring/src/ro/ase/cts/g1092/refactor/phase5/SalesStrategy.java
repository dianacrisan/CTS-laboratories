package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {
	
	// using the interfaces as reference types
	private MarketingStrategyInterface mkStrategy = null;
	private SalesValidatorsInterface validator = null;
	
	// removing the default constructor
	// force everyone to provide the strategies when creating a sales strategy
	// dependency injection (manual way here, can be done by choosing from a collection otherwise)
	public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorsInterface validator) {
		if(mkStrategy == null | validator == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
		this.validator = validator;
	}
	
	// optional - depends on your design specifications
	// allowing the change at runtime of marketing strategy
	public void setMarketingStrategy(MarketingStrategyInterface mkStrategy) {
		if(mkStrategy == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
		float initialDiscount = initialPrice - (discount * initialPrice);
		return initialDiscount * (1 - fidelityDiscount);
	}
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidPriceException, InvalidYearsSinceRegistrationException {		
		// if not sure that they are not null, they should be validated here as well
		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
		
		float finalPrice = 0;
		float fidelityDiscount = (productType != ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration) : 0;    
	        
		finalPrice = getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
		    
		return finalPrice;
	}
}