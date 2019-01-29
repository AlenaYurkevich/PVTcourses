package core;

public class Tester {
	public String name;
	public String surname;
	public int experienceInYears;
	public String englishLevel;
	public int salary;
	public static int amountOfCreatedTesters = 0;

	// five constructors

	public Tester() {

	}

	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
		amountOfCreatedTesters++;
	}

	public Tester(String name, String surname, int experienceInYears) {
		this(name, surname);
		this.experienceInYears = experienceInYears;

	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel) {
		this(name, surname, experienceInYears);
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel, int salary) {
		this(name, surname, experienceInYears, englishLevel);
		this.salary = salary;
	}

	// five getters

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getExperienceInYears() {
		return this.experienceInYears;
	}

	public String getEnglishLevel() {
		return this.englishLevel;
	}

	public int getSalary() {
		return this.salary;
	}

	// overloaded methods

	public void getTesterInfo(String name, String surname, String englishLevel) {
		System.out.println(name + " " + surname + " " + englishLevel);
	}

	public void getTesterInfo(String surname, int salary) {
		System.out.println(surname + " " + salary);
	}

	public double getTesterInfo(int salary) {
		double quotient = 0.8;
		return salary * quotient;
	}
	
	// static method
	
	public static void getAmountOfCreatedTesters() {
		System.out.println(amountOfCreatedTesters);
	}

}
