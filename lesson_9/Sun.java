package core;

public class Sun extends Star {

	private double distanceToEarth;
	private int activityCycleInYears;
	
	// overloaded constructors that are connected by 'this'
	public Sun(String name, double weight, int temperature, double radius, double distanceToEarth) {
		super(name, weight, temperature, radius);
		this.distanceToEarth = distanceToEarth;
	}
	
	public Sun(String name, double weight, int temperature, double radius, double distanceToEarth, int activityCycleInYears) {
		this(name, weight, temperature, radius, distanceToEarth);
		this.activityCycleInYears = activityCycleInYears;
	}

	public void printName() {
		System.out.println("I'm " + name + "!");

	}

	public void printWeight() {
		System.out.println("My weight is " + weight + " kg");

	}
	
	public int getYearOfNewCycleStart() {
		int previousCycleStartYear = 2009;
		return previousCycleStartYear + activityCycleInYears;
	}
	
	public void printDistanceToEarth() {
		System.out.println(distanceToEarth + " km! Quite a long way!");
	}

}
