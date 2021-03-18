package laboratory.classes.stage2;

import com.sun.source.tree.ThrowTree;

import laboratory.exceptions.InvalidAccountAgeException;
import laboratory.exceptions.invalidPriceException;

public class Product
{
	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public static void validatePrice(float _initialPrice) throws invalidPriceException
	{
		if(_initialPrice <= 0)
		{
			throw new invalidPriceException();
		}
	}
	public static void validateAccountAge(float _validateAccountAgeInYears) throws InvalidAccountAgeException
	{
		if(_validateAccountAgeInYears <= 0)
		{
			throw new InvalidAccountAgeException();
		}
	}
	
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidAccountAgeException, invalidPriceException
	  {
		
		validatePrice(initialPrice);
		validateAccountAge(accountAgeInYears);
		
		
		
		
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float)accountAgeInYears/100; 
	    float discountValue = 0;
	    
	    
	    switch(productType)
	    {
	    case NEW:	    
	        finalPrice = initialPrice;
	        break;
	   
	    case DISCOUNT:	    
	    	 discountValue = ProductType.DISCOUNT.getDiscount();
		     finalPrice = (initialPrice - (discountValue * initialPrice)) - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
		     break;
	    case LIMITED_STOCK:	    
	    	discountValue = ProductType.LIMITED_STOCK.getDiscount();
		    finalPrice = (initialPrice - (discountValue * initialPrice)) - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
		    break;
	    case LEGACY:	    
	        discountValue = ProductType.LEGACY.getDiscount();
		    finalPrice = (initialPrice - (discountValue * initialPrice)) - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
	        break;
	    default:	    
	    	throw new UnsupportedOperationException("New enum symbol not processed;");	
	      	    
	    }
	    
	   
	    
	    return finalPrice;
	  }
}