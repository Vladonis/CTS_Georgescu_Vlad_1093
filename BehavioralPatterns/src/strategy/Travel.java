package strategy;

public class Travel 
{
	private TravelToBananaRepublic theTravelStrategy;

	public TravelToBananaRepublic getTheTravelStrategy() 
	{
		return theTravelStrategy;
	}
	public void setTheTravelStrategy(TravelToBananaRepublic theTravelStrategy)
	{
		this.theTravelStrategy = theTravelStrategy;
	}
	
	
	public void goToBananaRepublic()
	{
		theTravelStrategy.goToBananaRepublic();
	}
	

}
