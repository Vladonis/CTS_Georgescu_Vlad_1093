package designpatterns.factory.simple.weapons;

public class Bazooka extends WeaponAbstract
{
	public Bazooka(String passedColour, int passedPower, int distance)
	{
		super(passedColour,passedPower);
	}

	@Override
	public void pewPew() 
	{
		System.out.println("------>(****)");
		
	}

}
