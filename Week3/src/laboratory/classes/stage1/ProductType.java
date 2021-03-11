package laboratory.classes.stage1;

public enum ProductType 
{
	NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discount;	
	
	public float getDiscount() 
	{
		return discount;
	}
	
	private ProductType(float _discount)
	{
		discount = _discount;
	}
	
	
	
}
