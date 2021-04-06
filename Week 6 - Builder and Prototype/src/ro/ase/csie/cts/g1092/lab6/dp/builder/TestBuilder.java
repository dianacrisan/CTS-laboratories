package ro.ase.csie.cts.g1092.lab6.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		// OPTION 1: not OK - will create bugs
		// 1. create
		// Superhero superHero = new Superhero();
		// 2. init
		// TO DO: don't forget to initialize the object with values
		
		
		// OPTION 2: not OK - so many values, easy to do mistakes
		Weapon pistol = new Weapon("Pistol");
		Superhero superHero = new Superhero("Superman", 100, false, false, pistol, null, "flying", "");
		Superhero superHero2 = new Superhero("Batman", 100, false, false, null, null, "", "");

		// BUILDER
		Superhero superman = 
				new Superhero.SuperheroBuilder("SuperMan", 100)
				.setLeftWeapon(pistol)
				.setSuperPower("flying")
				.setSuperSuperPower("laser eyes")
				.build();
		Superhero joker = 
				new Superhero.SuperheroBuilder("Joker", 200)
				.isVillain()
				.setRightWeapon(pistol)
				.build();
		
		Superhero dummyHero = 
				new Superhero.SuperheroBuilder("Dummy", 50)
				.build();
	}

}
