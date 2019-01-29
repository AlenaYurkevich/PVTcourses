package core;
import java.util.Scanner;

public class Task2_14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите размер массива: ");
        int number = scanner.nextInt();
        int mas [] = new int[number];
       
        // заполняем первый массив рандомными числами от 0 до 30
        for (int i = 0; i < mas.length; i++){
            mas [i] = (int)(Math.random()*30);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        
        // меняем местами первый и последний элементы массива и выводим новый вид массива
        int temp;
        temp = mas [0];
        mas [0] = mas [mas.length-1];
        mas [mas.length-1] = temp;
        for (int i = 0; i < mas.length; i++){
        System.out.print (mas[i] + " ");
        }
    }
}
