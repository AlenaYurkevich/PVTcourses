package core;
import java.util.Scanner;

public class Task2_2 {
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
		
		//выведение всех элементов массива C WHILE для более наглядной проверки
		int i=0;
		while (i<myArray.length) {
			System.out.println(myArray[i]);
			i++;
		}
		
		System.out.println();
		
		//вывод произведения всех элементов массива 
		int product = 1;
		for (int w=0; w< myArray.length; w++) {
			product = product * myArray[w];
		}
		System.out.println(product); 
	}
}
