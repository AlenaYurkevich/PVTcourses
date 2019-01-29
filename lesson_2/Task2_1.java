package core;
import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива (простое целое число): ");
		int number = scanner.nextInt();
		
		int[] myArray = new int[number];
		int a = 0;
		int b = 20;
		for (int i=0; i<myArray.length; i++) 
		{
		myArray[i]	= a + (int) (Math.random()*b); 
		}
		//с округлением сгенерированного числа (0-20) до целого
		
		//выводим все элементы в прямом порядке 
		for(int i = 0; i<myArray.length; i++) 
			System.out.println(myArray [i]);
		
		System.out.println();
		
		//выводим все элементы в обратном порядке
		for(int i = myArray.length-1;i>=0; i--) {
			System.out.println(myArray [i]);
		}
	}
}
