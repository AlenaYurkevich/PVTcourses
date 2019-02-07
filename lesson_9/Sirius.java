package core;

public class Sirius extends Star {
	
	private String alias;
	private int yearOfDiscovery;

	// overloaded constructors that are connected by 'this'
	public Sirius(String name, double weight, int temperature, double radius, String alias) {
		super(name, weight, temperature, radius);
		this.alias = alias;
	}
	
	public Sirius(String name, double weight, int temperature, double radius, String alias, int yearOfDiscovery) {
		this(name, weight, temperature, radius, alias);
		this.yearOfDiscovery = yearOfDiscovery;
	}

	@Override
	public void printName() {
		System.out.println("I'm " + name);

	}

	public void printWeight() {
		System.out.println("My weight is " + weight + " kg");

	}

	public void printAlias() {
		System.out.println("Sirius has another name - " + alias);
	}

	public int getYearsSinceSiriusDiscovery() {
		int currentYear = 2019;
		return currentYear - yearOfDiscovery;
	}

}
