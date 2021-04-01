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
	
	private SuperHero() 
	{
		
	}
	
	private SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, 
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
	
	public static class SuperHeroBuilder
	{
		SuperHero superHero;		
		
		public SuperHeroBuilder(String name , int lifepoints)
		{
			this.superHero=new SuperHero();
			this.superHero.name = name;
			this.superHero.lifePoints = lifepoints;			
		}
		
		public SuperHeroBuilder isVillain() 
		{
			this.superHero.isVillain = true;
			return this;
		}
		
		public SuperHeroBuilder isWounder()
		{
			this.superHero.isWounded = true;
			return this;			
		}
		public SuperHeroBuilder setRightWeapon(WeaponInferface weapon)
		{
			this.superHero.rightWeapon = weapon;
			return this;
		}
		public SuperHeroBuilder setLeftWeapon(WeaponInferface weapon)
		{
			this.superHero.leftWeapon = weapon;
			return this;
		}
		public SuperHeroBuilder setSuperPower1(SuperPowerInferface power1)
		{
			this.superHero.superPower1 = power1;
			return this;
		}
		public SuperHeroBuilder setSuperPower2(SuperPowerInferface power2)
		{
			this.superHero.superPower2 = power2;
			return this;
		}
		
		public SuperHero build()
		{
			return this.superHero;
		}
		
	}



}
