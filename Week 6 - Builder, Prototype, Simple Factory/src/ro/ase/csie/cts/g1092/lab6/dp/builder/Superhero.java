package ro.ase.csie.cts.g1092.lab6.dp.builder;

public class Superhero {
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isCriticallyWounded;
	
	Weapon leftHandWeapon;
	Weapon rightHandWeapon;
	
	String superPower;
	String superSuperPower;
	
	// remove the possibility of creating an empty super-hero
	private Superhero() {
		
	}

	public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticallyWounded, Weapon leftHandWeapon,
			Weapon rightHandWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isCriticallyWounded = isCriticallyWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	// the appropriate builder implementation version
	public static class SuperheroBuilder {
		Superhero superhero = null;
		
		// the most important attributes should be required
		public SuperheroBuilder(String name, int lifePoints) {
			this.superhero = new Superhero();
			this.superhero.name = name;
			this.superhero.lifePoints = lifePoints;
			
			// 2nd method
			// this.superhero = new Superhero(name, lifePoints, false, false, null, null, "", "");
		}
		
		public SuperheroBuilder isVillain() {
			this.superhero.isVillain = true;
			return this;
		}
		
		public SuperheroBuilder isWounded() {
			this.superhero.isCriticallyWounded = true;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(Weapon weapon) {
			this.superhero.leftHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setRightWeapon(Weapon weapon) {
			this.superhero.rightHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperPower(String superPower) {
			this.superhero.superPower = superPower;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperPower(String superSuperPower) {
			this.superhero.superSuperPower = superSuperPower;
			return this;
		}
		
		public Superhero build() {
			return this.superhero;
		}
	}
}
