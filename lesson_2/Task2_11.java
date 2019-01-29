package core;
import java.util.Scanner;

public class Task2_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива (простое целое число): ");
		int number = scanner.nextInt();
		int[] myArray = new int[number];
	    for (int i = 0; i < myArray.length; i++) {
	        myArray[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
	    }
	    System.out.println ("Введённые элементы массива ");
	    
	    //выводим все элементы в прямом порядке в одну строку для наглядной проверки
	    for (int i = 0; i < myArray.length; i++) {
	        System.out.print (myArray[i] + " "); 
	    }
	    System.out.println();
	    
	    // заменить все элементы массива на полусумму соседних элементов
	    // меняю исходный массив, первый и последний элементы не меняю
	    for (int i = 1; i < myArray.length - 1; i++) {
	    	myArray[i] = (myArray[i - 1] + myArray[i + 1]) / 2;
        }
	    for (int i = 0; i < myArray.length; i++) {
	        System.out.print (myArray[i] + " "); 
	    }
	}
}
