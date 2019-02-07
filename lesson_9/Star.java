package core;

public class Star extends StarSystem{
	
	protected int temperature;
	protected double radius;
	
	public Star () {
		
	}

	public Star(String name, double weight, int temperature, double radius) {
		super(name, weight);
		this.temperature = temperature;
		this.radius = radius;
	}
	
	@Override
	public void printName() {
		System.out.println("I'm a Star name");
		
	}

	@Override
	public void printWeight() {
		System.out.println("I'm a Star weight");
		
	}

	public void printTemperatureExclam() {
		System.out.println("I'm sooo hot! " + temperature + "K!");
	}
	
	public double getStarDiameter() {
		int quotient = 2;
		return radius * quotient;
	}
}
