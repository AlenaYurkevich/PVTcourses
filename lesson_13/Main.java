package core;

public class Main {

	public static void main(String[] args) {

		Massive massive = new Massive();

		massive.setSalary(1000);
		massive.setAmountOfWorkedDays(0);
		massive.divideSalaryByWorkedDays();

		int[] arrayBooksQuantity = new int[9];
		massive.setAmountInGroup(2);
		massive.printArrayBooks(arrayBooksQuantity); // type more than 9 in console
		massive.setAmountInGroup(0);
		massive.printArrayBooks(arrayBooksQuantity); // type less than 9 in console

		int[] array = new int[10];
		massive.addToArray(array); // type b=0
		massive.addToArray(array); // type a, b where a/b will be more than 10

		massive.setLength(-2);
		massive.setWidth(6);
		massive.printAreaValue();

	}

}
