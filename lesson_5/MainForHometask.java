package core;

public class MainForHometask {

	public static void main(String[] args) {

		String whitespace = " ";

		Tester tester1 = new Tester("Vasia", "Pupkin");
		System.out.println(tester1.getName() + whitespace + tester1.getSurname());

		Tester tester2 = new Tester("Anna", "Pupkina", 5);
		System.out.println(
				tester2.getName() + whitespace + tester2.getSurname() + whitespace + tester2.getExperienceInYears());

		Tester tester3 = new Tester("Tolik", "Pupkin", 7, "Up-int");
		System.out.println(tester3.getName() + whitespace + tester3.getSurname() + whitespace
				+ tester3.getExperienceInYears() + whitespace + tester3.getEnglishLevel());

		Tester tester4 = new Tester("Ivan", "Ivanov", 8, "Advanced", 5000);
		System.out.println(
				tester4.getName() + whitespace + tester4.getSurname() + whitespace + tester4.getExperienceInYears()
						+ whitespace + tester4.getEnglishLevel() + whitespace + tester4.getSalary());

		// calling the overloaded methods

		tester3.getTesterInfo("Stepan", "Popov", "Pre-int");
		tester4.getTesterInfo("Sokolov", 4500);
		System.out.println("Net salary: " + tester4.getTesterInfo(10000));

		// calling the static method

		Tester.getAmountOfCreatedTesters();
		
		// for Task5_2
		System.out.println(Task5_2.test1(("ytui")));
		
		// for Task5_3
		System.out.println(Task5_3.test5_3(("y&8 ")));

	}

}
