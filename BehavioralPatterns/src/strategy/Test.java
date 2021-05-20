package strategy;

public class Test 
{
	public static void main(String[] args)
	{
		Travel vacation1 = new Travel();
		
	    vacation1.setTheTravelStrategy(new ByCar());
		vacation1.setTheTravelStrategy(new ByTaxi());
		vacation1.setTheTravelStrategy(new ByTrain());
		
		System.out.println("The method of transport: ");
		vacation1.goToBananaRepublic();		
	}
}
