package core;
import java.util.Scanner;

public class Task2_10 {

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
		    
		    //проверка, является ли массив возрастающей последовательностью
		    boolean flag = true;
	        for (int i = 1; i < myArray.length; i++) {
	             if(myArray[i]<=myArray[i-1]){
	                flag = false;
	                break;
	            }
	        }
	        if(flag){
	            System.out.println("Массив является возрастающей последовательностью");
	        } else {
	            System.out.println("Массив НЕ является возрастающей последовательностью");
	        }
	}
}
