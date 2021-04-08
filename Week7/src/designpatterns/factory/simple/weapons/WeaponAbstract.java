package designpatterns.factory.simple.weapons;

public abstract class WeaponAbstract 
{
	String colourWeapon;
	int power;
	
	
	public WeaponAbstract(String passedColour, int passedPower)
	{
		colourWeapon = passedColour;
		power = passedPower;
	}
	
	
	public abstract void pewPew();
	
	

}
