package core;

public class Task2_15 {
	public static void main(String args[]) {
		int size1 = 2;
		int size2 = 2;
		int[][] array = new int[size1][size2]; // creation of a two-dimensional array

		for (int i = 0; i < array.length; i++) {
			for (int y = 0; y < array[i].length; y++) {
				array[i][y] = (int) (Math.random() * 50); // filling in the array
				System.out.print(array[i][y] + " "); // direct order output
			}
			System.out.println();
		}

		for (int i = array.length - 1; i >= 0; i--) {
			for (int y = array[i].length - 1; y >= 0; y--) {
				System.out.print(array[i][y] + " "); // reverse order output

			}
			System.out.println();
		}

		int max = -1;
		for (int i = 0; i < array.length; i++) {
			for (int y = 0; y < array[i].length; y++) {
				if (array[i][y] > max) {
					max = array[i][y]; // max element
				}

			}
		}
		System.out.println("Max = " + max);

		int min = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int y = 0; y < array[i].length; y++) {
				if (array[i][y] < min) {
					min = array[i][y]; // min element
				}

			}
		}
		System.out.println("Min = " + min);

	}
}