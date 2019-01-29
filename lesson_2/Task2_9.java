package core;
import java.util.Scanner;

public class Task2_9 {

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
		
		//выводим все элементы в прямом порядке в одну строку
		for(int i = 0; i<myArray.length; i++) 
			System.out.print(myArray [i] + " ");
		
		System.out.println();
		
		// найти номер максимального элемента и вывести
		int max = myArray[0];
		for(int i=0;i<myArray.length;i++) {
			if(max < myArray[i])
		    max = myArray[i];
		}
		int val = max;
		int numMax=-1;
		for(int i=0;i<myArray.length;i++)
		{
		  if(myArray[i] == val)
		    numMax = i;
		}
		System.out.println("Номер максимального элемента = " + numMax);
		
		// найти номер минимального элемента и вывести
		int min = myArray[0];
		for(int i=0;i<myArray.length;i++) {
			if(min > myArray[i])
		    min = myArray[i];
		}
		int val2 = min;
		int numMin=-1;
		for(int i=0;i<myArray.length;i++)
		{
		  if(myArray[i] == val2)
		    numMin = i;
		}
		System.out.println("Номер минимального элемента = " + numMin);
	}
}
