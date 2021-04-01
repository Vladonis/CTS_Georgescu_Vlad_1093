package designPattern.builder;

public class SuperHero
{
	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;

	private WeaponInferface rightWeapon;
	private WeaponInferface leftWeapon;
	
	private SuperPowerInferface superPower1;
	private SuperPowerInferface superPower2;
	
	public SuperHero() 
	{
		
	}
	
	public SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, 
			WeaponInferface rightWeapon, WeaponInferface leftWeapon,
			SuperPowerInferface superPower1, SuperPowerInferface superPower2) 
	{
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower1 = superPower1;
		this.superPower2 = superPower2;
	}



}
