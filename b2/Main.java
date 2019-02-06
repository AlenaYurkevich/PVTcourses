package core;

public class Main {

	public static void main(String[] args) {
		Tester tester1 = new Tester("Vasia", "Sidorov", 5, "Intermediate", 1500);
		
		tester1.getEnglishLevel();
		tester1.getExperienceInYears();
		tester1.getName();
		tester1.getSalary();
		tester1.getSurname();
		
		tester1.setEnglishLevel("Beginner");
		tester1.setExperienceInYears(6);
		tester1.setName("Onotole");
		tester1.setSalary(1000);
		tester1.setSurname("Makedonsky");
		
		tester1.printAllInfo("Egor", "Petrov", 10, "Advanced", 2000);
		tester1.printNameSurname("Anna", "Ivanova");
		tester1.experienceInMonths(2);
		// tester1.multipliedSalary(300); - the method is not visible because it's private
		
		

	}

}
