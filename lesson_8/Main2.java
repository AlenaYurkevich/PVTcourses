package notCore;

import core.Tester;

public class Main2 {

	public static void main(String[] args) {
		Tester tester1 = new Tester("Vasia", "Sidorov", 5, "Intermediate", 1500);

		// tester1.getEnglishLevel(); - the method is not visible because it's friendly
		// tester1.getExperienceInYears(); - the method is not visible because it's
		// friendly
		// tester1.getName(); - the method is not visible because it's friendly
		// tester1.getSalary(); - the method is not visible because it's friendly
		// tester1.getSurname(); - the method is not visible because it's friendly

		// tester1.setEnglishLevel("Beginner"); - the method is not visible because it's
		// friendly
		// tester1.setExperienceInYears(6); - the method is not visible because it's
		// friendly
		// tester1.setName("Onotole"); - the method is not visible because it's friendly
		// tester1.setSalary(1000); - the method is not visible because it's friendly
		// tester1.setSurname("Makedonsky"); - the method is not visible because it's
		// friendly

		tester1.printAllInfo("Vadim", "Volk", 11, "Advanced", 4000);
		// tester1.printNameSurname("Anna", "Ivanova"); - the method is not visible
		// because it's protected
		// tester1.experienceInMonths(2); - the method is not visible because it's
		// friendly
		// tester1.multipliedSalary(300); - the method is not visible because it's
		// private

	}

}
