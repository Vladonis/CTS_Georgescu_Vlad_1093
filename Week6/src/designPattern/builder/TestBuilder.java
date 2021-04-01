package designPattern.builder;

public class TestBuilder 
{
	public static void main(String[] args)
	{
		/*
		 * SuperHero superHero = new SuperHero();
		 * SuperHero superHero2 = new SuperHero("Superman", 100, false, false, new
		 * Weapon(), null, new Flying(), null);
		 */
	
		SuperHero supermanHero = 
				new SuperHero.SuperHeroBuilder("Superman", 1000).build();
		
		SuperHero joker =
				new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.isWounder()
				.setLeftWeapon(new Weapon())
				.build();
				
	
		
	}

}
