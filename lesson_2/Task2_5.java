package core;
import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива (простое целое число): ");
		int number = scanner.nextInt();
		int[] myArray = new int[number];
	    for (int i = 0; i < myArray.length; i++) {
	        myArray[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
	    }
	    System.out.println ("Введённые элементы массива ");
	    
	    //выводим все элементы в прямом порядке для более наглядной проверки
	    for (int i = 0; i < myArray.length; i++) {
	        System.out.println (myArray[i]); 
	    }
	    System.out.println();
		
	    
		int count = 0;
		for (int i=0; i< myArray.length; i++) {
			if(myArray[i]==0) {
				System.out.println(i);
				count++;
				}
			} 
		if (count==0) {
			System.out.println("Нулевых элементов нет");
		}
	}
}
