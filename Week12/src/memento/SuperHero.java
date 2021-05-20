package memento;

public class SuperHero 
{
	String name;
	int lifepoins;
	String magic;
	
	public SuperHero(String name, int lifepoins, String magic) 
	{
		super();
		this.name = name;
		this.lifepoins = lifepoins;
		this.magic = magic;
	}
	
	public void attack() 
	{
		System.out.println("Is attacking");
	}
	
	public void heal(int point)
	{
		this.lifepoins += point;
	}
	public void takeDamage(int point)
	{
		this.lifepoins -= point;
	}
	
	
	
	

}
