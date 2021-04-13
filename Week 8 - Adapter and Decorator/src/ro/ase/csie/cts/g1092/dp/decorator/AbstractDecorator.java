package ro.ase.csie.cts.g1092.dp.decorator;

// purpose of this class is to allow us to build other specific decorators
public abstract class AbstractDecorator extends SuperHeroCharacter {
	
	SuperHeroCharacter decoratedObject;
	
	public AbstractDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject.name, decoratedObject.power);
		this.decoratedObject = decoratedObject;
	}

	@Override
	public void move() {
		this.decoratedObject.move();
	}

	@Override
	public void crouch() {
		this.decoratedObject.crouch();
	}

	@Override
	public void takeAHit(int points) {
		this.decoratedObject.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		this.decoratedObject.heal(points);
	}
	
	
}
