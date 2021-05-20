package memento;

public class Test {

	public static void main(String[] args)
	{
		SuperHero batman = new SuperHero("Batman", 10, "Money");
		
		HeroMemento initialSave1 = batman.createSavePoint();
		
		batman.takeDamage(4);
		batman.takeDamage(2);
		
		System.out.println("Lifepoints: " + batman.lifepoins);
		
		
		System.out.println("Lifepoints: " + batman.lifepoins);


		
		
		

	}

}
