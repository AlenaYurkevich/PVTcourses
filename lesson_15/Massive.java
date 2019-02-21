package core;

public class Massive {
	String descr = "There are some array methods below";
	int amount;

	public int getAmount() {
		return amount;
	}

	public String getDescr() {
		return descr;
	}

	public int[] getArrayReverseOrder(int[] array) {
		int[] newArray = new int[array.length];
		for (int i = array.length - 1, y = 0; i >= 0; i--, y++) {
			newArray[y] = array[i];
		}
		return newArray;
	}

	public int getProductOfArrayItems(int[] arrayToMultiply) {
		int product = 1;
		for (int w = 0; w < arrayToMultiply.length; w++) {
			product = product * arrayToMultiply[w];
		}
		return product;
	}

	public int getInexistentIndex(int[] arrayForException) throws ArrayIndexOutOfBoundsException {
		int inexistent = arrayForException[arrayForException.length];
		return inexistent;
	}

	public int getMax(int[] arrayForMax) {
		int max = arrayForMax[0];
		for (int i = 0; i < arrayForMax.length; i++) {
			if (max < arrayForMax[i])
				max = arrayForMax[i];
		}
		return max;
	}

	public int getMin(int[] arrayForMin) {
		int min = arrayForMin[0];
		for (int i = 0; i < arrayForMin.length; i++) {
			if (min > arrayForMin[i])
				min = arrayForMin[i];
		}
		return min;
	}

	public int getSecondPower(int a) {
		int pow = 2;
		return (int) Math.pow(a, pow);
	}
}
