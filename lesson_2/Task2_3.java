package core;
import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива (простое целое число): ");
		int number = scanner.nextInt();
		
		int[] myArray = new int[number];
		int a = 1;
		int b = 50;
		for (int i=0; i<myArray.length; i++) {
			myArray[i]	= a + (int) (Math.random()*b); 
		}
		//с округлением сгенерированного числа (1-50) до целого
		
		//выводим все элементы в прямом порядке для более наглядной проверки
		for(int i = 0; i<myArray.length; i++) 
			System.out.println(myArray [i]);
		System.out.println();
		
		//умножаем каждый третий элемент на два, вариант первый
		for(int i = 2; i < myArray.length; i += 3) {
            myArray[i] *= 2;
        }
		
		/*Вывод обновлённого варианта массива после умножений
		for(int i = 0; i<myArray.length; i++) 
			System.out.println(myArray [i]); 
			System.out.println(); */
		
		//умножаем каждый третий элемент на два, вариант второй, цикл WHILE
        int c = 2;
        while(c < myArray.length) {
            myArray[c] *= 2;
            c += 3;
        }
        System.out.println();
        
        /*Вывод обновлённого варианта массива после умножений
		for(int i = 0; i<myArray.length; i++) 
			System.out.println(myArray [i]); */
	}
}
