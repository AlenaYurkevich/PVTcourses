package core;

public class MainClassForMassive {

	public static void main(String[] args) {

		// create an array called 'array' with some data
		int[] array = { 2, 13, 56, 4, 78 };

		// create an object of the 'Massive' class
		Massive massive = new Massive();

		// print the above created array (direct and reverse orders) using Massive class methods
		massive.printMassiveAsLine(array);
		System.out.println();
		massive.printReverseMassiveAsLine(array);
		System.out.println();

		// print the sum of the 'array' elements using Massive class methods
		System.out.println("Sum: " + massive.getSumOfElements(array));

		// print the array multiplied by 3 (direct and reverse orders) using Massive class methods
		massive.printMassiveAsLine(massive.multiplyBy3(array));
		System.out.println();
		massive.printReverseMassiveAsLine(massive.multiplyBy3(array));

	}

}
