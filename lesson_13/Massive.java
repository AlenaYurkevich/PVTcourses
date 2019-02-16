package core;

import java.util.Scanner;

public class Massive {
	private int amountInGroup;
	private int salary;
	private int amountOfWorkedDays;
	private int length;
	private int width;

	public void setAmountInGroup(int amountInGroup) {
		this.amountInGroup = amountInGroup;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAmountOfWorkedDays(int amountOfWorkedDays) {
		this.amountOfWorkedDays = amountOfWorkedDays;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// one try and one catch
	public void divideSalaryByWorkedDays() {
		try {
			System.out.println(salary / amountOfWorkedDays);
		} catch (ArithmeticException e) {
			System.out.println("No working days! Division by zero!");
		}
	}

	// several catch blocks
	public void printArrayBooks(int[] arrayBooksQuantity) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number for Books Array");
			int x = scanner.nextInt();
			arrayBooksQuantity[x] = 11;
			System.out.println(arrayBooksQuantity[x] / amountInGroup);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No such quantity of books");
		} catch (ArithmeticException ex) {
			System.out.println("No people in the group! Division by zero!");
		}
	}

	// multi-catch
	public void addToArray(int[] array) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a");
			int a = scan.nextInt();
			System.out.println("Enter b");
			int b = scan.nextInt();
			int c = a / b;
			array[c] = 12;
			scan.close();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Failure to add to the array");
		}
	}

	// try-catch-finally
	public void printAreaValue() {
		try {
			if (length < 0 || width < 0)
				throw new IllegalArgumentException();
			System.out.println("Area: " + length * width);
		} catch (IllegalArgumentException ex) {
			System.out.println("Length or width cannot be negative");
		} finally {
			System.out.println("Anyway, life is good!");
		}

	}
}
