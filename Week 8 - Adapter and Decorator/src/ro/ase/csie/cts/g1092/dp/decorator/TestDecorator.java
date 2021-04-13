package ro.ase.csie.cts.g1092.dp.decorator;

import ro.ase.csie.cts.g1092.dp.decorator.FantasySuperHero;
import ro.ase.csie.cts.g1092.dp.decorator.SuperHeroCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		
		SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue dragon", 1000, true);
		fantasyHero.move();
		
		fantasyHero.takeAHit(500);
		
		// the dragon should look and behave like a wounded one
		SuperHeroCharacter woundedHero = new WoundedDecorator(fantasyHero); // can also use just fantasyHero
		woundedHero.move(); 
		
		fantasyHero.heal(200);
		
		// add a shield /armor to the dragon
		SuperHeroCharacter heroWithShield = new ShieldDecorator(fantasyHero, 200);
		heroWithShield.takeAHit(500);
		
		// apply shield to wounded hero (double decoration)
		SuperHeroCharacter woundedHeroWithShield = new ShieldDecorator(woundedHero, 250);
		woundedHeroWithShield .move();
		woundedHeroWithShield.takeAHit(260);
	}

}
