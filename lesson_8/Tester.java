package core;

public class Tester {
	public String name;
	public String surname;
	protected int experienceInYears;
	String englishLevel; // friendly type
	private int salary;
	String whitespace = " ";

	// 1. constructors:
	public Tester() {

	}

	protected Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	Tester(String name, String surname, int experienceInYears) {
		this(name, surname);
		this.experienceInYears = experienceInYears;

	}

	private Tester(String name, String surname, int experienceInYears, String englishLevel) {
		this(name, surname, experienceInYears);
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel, int salary) {
		this(name, surname, experienceInYears, englishLevel);
		this.salary = salary;
	}

	// 2. getters and setters that can be accessed only inside the package

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExperienceInYears() {
		return experienceInYears;
	}

	void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	// 3. a method (can be accessed only inside the class) to return salary*2
	private int multipliedSalary(int salary) {
		int quotient = 2;
		return salary * quotient;
	}

	// 4. a method (can be accessed only inside the package) to return the
	// experience in months
	int experienceInMonths(int experienceInYears) {
		int months = 12;
		return experienceInYears * months;
	}

	// 5. a method (can be accessed inside the package and (for the descendants)
	// from other packages)
	// to print the name and surname
	protected void printNameSurname(String name, String surname) {
		System.out.println(name + whitespace + surname);
	}

	// 6. a method (can be accessed from everywhere) to print all info in one line
	public void printAllInfo(String name, String surname, int experienceInYears, String englishLevel, int salary) {
		System.out.print(name + whitespace + surname + whitespace + experienceInYears + whitespace + englishLevel
				+ whitespace + salary);
	}

}
