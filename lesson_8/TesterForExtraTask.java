package extraTask;

public class TesterForExtraTask {
	String name;
	String surname;

	// a constructor that prohibits to create a Tester class object within other
	// classes
	private TesterForExtraTask(String name, String surname) {
		this.name = name;
		this.surname = surname;

	}

	// a public method that has access to the class Constructor
	public static TesterForExtraTask getObject(String name, String surname) {
		return new TesterForExtraTask(name, surname);
	}

	public void printInfo() {
		System.out.println(name + " " + surname);

	}
}
