package designpatterns.factory.simple.weapons;

public class Pistol extends WeaponAbstract
{

	public Pistol(String passedColour, int passedPower)
	{
		super(passedColour,passedPower);
	}

	@Override
	public void pewPew() 
	{
		System.out.println("-------->");		
	}
	
	
	
}
