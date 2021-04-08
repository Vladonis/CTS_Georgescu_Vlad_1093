package designpatterns.factory.simple.weapons;

public class MachineGun extends WeaponAbstract
{
	
	public MachineGun(String passedColour, int passedPower)
	{
		super(passedColour,passedPower);
	}

	@Override
	public void pewPew() 
	{
		System.out.println("-->-->->->");
		
	}

}
