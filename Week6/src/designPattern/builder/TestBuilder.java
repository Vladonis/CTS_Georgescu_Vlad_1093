package designPattern.builder;

public class TestBuilder 
{
	public static void main(String[] args)
	{
		SuperHero superHero = new SuperHero();
		
		SuperHero superHero2 
		= new SuperHero("Superman", 100, 
				false, false, 
				new Weapon(), null, new Flying(), null);
		
		
	}

}
