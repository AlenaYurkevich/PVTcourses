package core;

public class Main {

	public static void main(String[] args) {
		Sirius sirius = new Sirius("SiriusB", 3.88888, 9940, 1.9, "Warepil", 1844);
		sirius.printName(); // overloaded abstract method from superclass StarSystem
		sirius.printWeight(); // overloaded abstract method from superclass StarSystem
		System.out.println("My diameter is " + sirius.getStarDiameter()); // method from superclass Star
		sirius.printTemperatureExclam(); // method from superclass Star
		sirius.printAlias();
		System.out.println(
				sirius.getYearsSinceSiriusDiscovery() + " years have passed since the start of the observation");
		sirius.printGreetings(); // method from superclass StarSystem

		System.out.println();
		Earth earth = new Earth();
		earth.printName(); // overloaded abstract method from superclass StarSystem
		earth.printWeight(); // overloaded abstract method from superclass StarSystem
		earth.setOxygenPercentage(44.8);
		System.out.println(earth.getOxygenPercentage());
		earth.setSurfaceCoveredByWaterPercentage(57.7);
		System.out.println(earth.getSurfaceCoveredByWaterPercentage());
		earth.printGroundCoveragePercentage();
		earth.printNonOxygenPercentage();
		earth.setPopulation(7000000);
		earth.printPopulationExclam(); // method from superclass Planet
		earth.setNumberOfSatellites(1);
		System.out.println(earth.lessSatellitesThanJupiter()); // method from superclass Planet

		System.out.println();
		Sun sun = new Sun("Sun", 60000, 15000, 20, 15000, 11);
		sun.printName(); // overloaded abstract method from superclass StarSystem
		sun.printWeight(); // overloaded abstract method from superclass StarSystem
		System.out.println("New cycle starts in " + sun.getYearOfNewCycleStart());
		sun.printDistanceToEarth();
		sun.printTemperatureExclam(); // method from superclass Star
		System.out.println("My diameter is " + sun.getStarDiameter()); // method from superclass Star

		System.out.println();
		Mars mars = new Mars();
		mars.printName(); // overloaded abstract method from superclass StarSystem
		mars.printWeight(); // overloaded abstract method from superclass StarSystem
		mars.printGreetings(); // method from superclass StarSystem
		System.out.println("Centuries: " + mars.ageInCenturies()); // method from superclass StarSystem

		System.out.println();
		Planet planet = new Planet();
		planet.printName(); // overloaded abstract method from superclass StarSystem
		planet.printWeight(); // overloaded abstract method from superclass StarSystem
		planet.printGreetings(); // method from superclass StarSystem
		planet.printPopulationExclam(); // '0' because no setter to set the value

		System.out.println();
		Star star = new Star();
		star.printName(); // overloaded abstract method from superclass StarSystem
		star.printWeight(); // overloaded abstract method from superclass StarSystem
		System.out.println("Centuries: " + star.ageInCenturies()); // method from superclass StarSystem

	}

}
