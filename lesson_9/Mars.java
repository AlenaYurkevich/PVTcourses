package core;

public class Mars extends Planet {

	private double carbonDioxidePercent;
	private double numberOfCraters;
	
	// overloaded constructors that are not connected
	public Mars() {
		
	}
	
	public Mars(String name, double weight) {
		super(name, weight);
	}
	
	public void printName() {
		System.out.println("I'm Mars");

	}

	public void printWeight() {
		System.out.println("My weight is 6,39E23 kg");

	}
	
	public double getNumberOfUndiscoveredCraters() {
		double quotientOfDiscoveredCraters = 0.21;
		double quotientOfUndiscoveredCraters = 1 - quotientOfDiscoveredCraters;
		return numberOfCraters * quotientOfUndiscoveredCraters;
	}
	
	public double getOtherThanСarbonDioxidePercent() {
		double maxPercent = 100;
		return maxPercent - carbonDioxidePercent;
	}

}


