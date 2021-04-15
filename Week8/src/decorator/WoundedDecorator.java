package decorator;

import adapter.ACMECharacter;

public class WoundedDecorator extends ACMEAbstractDecorator{
	
	public final static int MIN_POINTS = 200;

	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.character.getLifePoints() < MIN_POINTS) {
			System.out.println("You can't move. Is critical wounded");
		}
		else
			this.character.move();
	}
	
	

}
