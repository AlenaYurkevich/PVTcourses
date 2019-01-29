package core;
import java.util.Scanner;

public class Task2_6 {

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
		
    //пройти по массиву и поменять местами каждые 2 соседних элемента
		int temp;
        for (int i = 0; i < myArray.length - 1; i += 2) {
            temp = myArray[i];
            myArray[i] = myArray[i + 1];
            myArray[i + 1] = temp;
        }
        for (int i : myArray) {
            System.out.println(i);
        } 	
	}
}
