package core;
import java.util.Scanner;

public class Task2_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива (простое целое число): ");
		int number = scanner.nextInt();
		
		int[] myArray = new int[number];
		int a = 1;
		int b = 100;
		for (int i=0; i<myArray.length; i++) {
			myArray[i]	= a + (int) (Math.random()*b); 
		}
		//с округлением сгенерированного числа (1-100) до целого
		
		//выводим все элементы в прямом порядке 
		for(int i = 0; i<myArray.length; i++) 
			System.out.println(myArray [i]);
	
		System.out.println();
		
		//поменять местами первый и последний, второй и предпоследний элементы и т.д.
		int n = myArray.length;
		int t;
		for (int i = 0; i < n/2; i++) {
		    t = myArray[n-i-1];
		    myArray[n-i-1] = myArray[i];
		    myArray[i] = t;   
		}
		//выводим новый вариант массива
		for (int i : myArray) {
            System.out.println(i);
        }
	}
}
