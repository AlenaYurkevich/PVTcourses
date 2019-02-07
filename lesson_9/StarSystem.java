package core;

public abstract class StarSystem {

	protected String name;
	protected double weight;
	protected int ageInYears = 20000;

	// overloaded constructors that are not connected
	public StarSystem() {

	}

	public StarSystem(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	// non-abstract methods below
	public void printGreetings() {
		System.out.println("Hello, aliens! Please find some info about me.");
	}

	public int ageInCenturies() {
		int yearsInCentury = 100;
		return ageInYears / yearsInCentury;
	}

	// abstract methods below
	public abstract void printName();

	public abstract void printWeight();

}
