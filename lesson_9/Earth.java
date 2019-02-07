package core;

public class Earth extends Planet {

	private double oxygenPercentage;
	private double surfaceCoveredByWaterPercentage;
	
	// overloaded constructors that are not connected
	public Earth() {
		
	}
	
	public Earth(String name, double weight) {
		super(name, weight);
	}

	public void printName() {
		System.out.println("I'm Earth");

	}

	public void printWeight() {
		System.out.println("My weight is 5,972E24 kg");

	}

	public void printGroundCoveragePercentage() {
		double maxPercent = 100;
		System.out.println("Ground coverage: " + (maxPercent - surfaceCoveredByWaterPercentage));
	}

	public void printNonOxygenPercentage() {
		double maxPercent = 100;
		System.out.println("Non-oxygen: " + (maxPercent - oxygenPercentage));
	}

	//getters and setters
	public double getOxygenPercentage() {
		return oxygenPercentage;
	}

	public void setOxygenPercentage(double oxygenPercentage) {
		this.oxygenPercentage = oxygenPercentage;
	}

	public double getSurfaceCoveredByWaterPercentage() {
		return surfaceCoveredByWaterPercentage;
	}

	public void setSurfaceCoveredByWaterPercentage(double surfaceCoveredByWaterPercentage) {
		this.surfaceCoveredByWaterPercentage = surfaceCoveredByWaterPercentage;
	}
	
	

}
