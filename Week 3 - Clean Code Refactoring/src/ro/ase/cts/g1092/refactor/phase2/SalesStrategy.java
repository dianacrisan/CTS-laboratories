package ro.ase.cts.g1092.refactor.phase2;

public class SalesStrategy {
	
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float ComputeFinalPrice(int productType, float initialPrice, int yearsSinceRegistration)
	  {
		    float finalPrice = 0;
		    float fidelityDiscount = 
		    		(yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
		    if (productType == 1)
		    {
		      finalPrice = initialPrice;
		    }
		    else if (productType == 2)
		    {
		      finalPrice = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		    }
		    else if (productType == 3)
		    {
		      finalPrice = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
		    }
		    else if (productType == 4)
		    {
		      finalPrice = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
		    }
		    return finalPrice;
	  }
}