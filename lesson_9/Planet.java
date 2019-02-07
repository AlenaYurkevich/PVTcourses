package core;

public class Planet extends StarSystem {

	protected int population;
	protected int numberOfSatellites;

	// overloaded constructors that are not connected
	public Planet() {

	}

	public Planet(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void printName() {
		System.out.println("I'm a Planet name");

	}

	@Override
	public void printWeight() {
		System.out.println("I'm a Planet weight");

	}

	public void printPopulationExclam() {
		System.out.println("Wow! " + population + " creatures live here!!!");
	}

	public int lessSatellitesThanJupiter() {
		int jupiterSatellites = 60;
		return jupiterSatellites - numberOfSatellites;
	}

	// getters and setters
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getNumberOfSatellites() {
		return numberOfSatellites;
	}

	public void setNumberOfSatellites(int numberOfSatellites) {
		this.numberOfSatellites = numberOfSatellites;
	}
	
	

}
