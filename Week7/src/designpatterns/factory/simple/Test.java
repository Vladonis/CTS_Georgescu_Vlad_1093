package designpatterns.factory.simple;

import designpatterns.factory.simple.weapons.Bazooka;
import designpatterns.factory.simple.weapons.MachineGun;
import designpatterns.factory.simple.weapons.Pistol;
import designpatterns.factory.simple.weapons.WeaponAbstract;
import designpatterns.factory.simple.weapons.WeaponType;

public class Test 
{

	public static void main(String[] args) 
	{
		WeaponAbstract pistol = new Pistol("Black", 100);
        WeaponAbstract machineGun = new MachineGun("Red",50);
        WeaponAbstract bazooka = new Bazooka("Green",1000,300);
        
        WeaponAbstract weapon = WeaponFactory.getWeapon(WeaponType.PISTOL,"Red");

        
        
	}
}
