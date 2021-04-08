package designpatterns.factory.simple;

import designpatterns.factory.simple.weapons.Bazooka;
import designpatterns.factory.simple.weapons.MachineGun;
import designpatterns.factory.simple.weapons.Pistol;
import designpatterns.factory.simple.weapons.WeaponAbstract;
import designpatterns.factory.simple.weapons.WeaponType;

public class WeaponFactory 
{
	public static WeaponAbstract getWeapon(WeaponType passedType, String passedColour)
	{
		WeaponAbstract weapon = null;
		switch (passedType) 
		{
		case PISTOL:
			weapon = new Pistol(passedColour, 100);
			break;
		case MACHINEGUN:
			weapon = new MachineGun(passedColour, 100);
			break;
		case BAZOOKA:
			weapon = new Bazooka(passedColour, 1000, 500);
			break;	

		default:
			throw new UnsupportedOperationException();
		}
		return weapon;
	}
	
	
	

}
