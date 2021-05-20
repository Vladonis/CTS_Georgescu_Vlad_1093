package memento;

import java.util.Date;

public class HeroMemento 
{
	String name;
	int lifepoins;
	String magic;
	
	Date timestamp;

	public HeroMemento(String name, int lifepoins, String magic) 
	{
		super();
		this.name = name;
		this.lifepoins = lifepoins;
		this.magic = magic;
		
		this.timestamp = new Date();
	}
	
	public HeroMemento createSavePoint()
	{
	return new HeroMemento(name, lifepoins, magic);
	}
	public void restore(HeroMemento mementoHero)
	{
		this.name = mementoHero.name;
		this.lifepoins = mementoHero.lifepoins;
		this.magic = mementoHero.magic;
	}
}
