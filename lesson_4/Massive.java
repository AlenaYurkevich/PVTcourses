package core;

public class Massive {

	public void printMassiveAsLine(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public void printReverseMassiveAsLine(int[] mas) {
		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.print(mas[i] + " ");
		}
	}

	public int getSumOfElements(int[] mas) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		return sum;

	}

	public int[] multiplyBy3(int[] mas) {
		int[] mas2 = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			mas2[i] = mas[i] * 3;
		}
		return mas2;
	}

}