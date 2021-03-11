package laboratory.classes;

import laboratory.classes.stage1.Product;
import laboratory.classes.stage1.ProductType;
import laboratory.exceptions.InvalidAccountAgeException;
import laboratory.exceptions.invalidPriceException;

public class TestProduct 
{
	public static void main(String[] args) throws InvalidAccountAgeException, invalidPriceException 
	{
		Product product = new Product();
		
		product.getFinalPrice(ProductType.DISCOUNT , 0 , 10);
		

	}

	

}
