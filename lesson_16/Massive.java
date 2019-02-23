package core;

import java.util.Arrays;

public class Massive {

	// 1
	public Integer[] getArrayReverseOrder(Integer[] array) {
		Integer[] newArray = new Integer[array.length];
		for (int i = array.length - 1, y = 0; i >= 0; i--, y++) {
			newArray[y] = array[i];
		}
		return newArray;
	}

	// 2
	public int getProductOfArrayItems(int[] arrayToMultiply) {
		int product = 1;
		for (int w = 0; w < arrayToMultiply.length; w++) {
			product = product * arrayToMultiply[w];
		}
		return product;
	}

	// 3
	public int getInexistentIndex(int[] arrayForException) throws ArrayIndexOutOfBoundsException {
		int inexistent = arrayForException[arrayForException.length];
		return inexistent;
	}

	// 4
	public int getMax(int[] arrayForMax) {
		int max = arrayForMax[0];
		for (int i = 0; i < arrayForMax.length; i++) {
			if (max < arrayForMax[i])
				max = arrayForMax[i];
		}
		return max;
	}

	// 5
	public int getMin(int[] arrayForMin) {
		int min = arrayForMin[0];
		for (int i = 0; i < arrayForMin.length; i++) {
			if (min > arrayForMin[i])
				min = arrayForMin[i];
		}
		return min;
	}

	// 6
	public Integer getSecondPower(Integer a) {
		return a * a;
	}

	// 7
	public Integer[] getArrayWithInterchangedAdjItems(Integer[] arrayToChange) {
		Integer[] newArray2 = new Integer[arrayToChange.length];
		int temp;
		for (int i = 0; i < arrayToChange.length - 1; i += 2) {
			temp = arrayToChange[i];
			arrayToChange[i] = arrayToChange[i + 1];
			arrayToChange[i + 1] = temp;
		}
		newArray2 = arrayToChange;
		return newArray2;
	}

	// 8
	public Integer[] getArrayWithInterchangedFirstLast(Integer[] arrayToBeChanged) {
		Integer[] newArray3 = new Integer[arrayToBeChanged.length];
		int temp;
		temp = arrayToBeChanged[0];
		arrayToBeChanged[0] = arrayToBeChanged[arrayToBeChanged.length - 1];
		arrayToBeChanged[arrayToBeChanged.length - 1] = temp;
		newArray3 = arrayToBeChanged;
		return newArray3;
	}

	// 9
	public String[] getOrderedFromMinToMax(String[] text) {
		String[] newText = new String[text.length];
		for (int i = 0; i < text.length; i++) {
			for (int j = 0; j < text.length - 1 - i; j++) {
				if (text[j].length() > text[j + 1].length()) {
					String str = text[j];
					text[j] = text[j + 1];
					text[j + 1] = str;
				}
			}
		}
		newText = text;
		return newText;
	}

	// 10
	public boolean checkIfZPresent(String[] letters) {
		boolean result = Arrays.asList(letters).contains("z");
		return result;
	}

	// 11 (to make more meaningful tests)
	public Double getSalaryPerDay(Double monthSalary, Double daysInMonth) {
		return monthSalary / daysInMonth;
	}
}