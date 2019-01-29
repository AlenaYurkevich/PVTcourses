package core;
import java.util.Scanner;

public class Task2_13 {
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
        
        // ищем минимальный элемент и выводим его
        int min = mas[0];
        for (int i=0; i<mas.length; i++){
            if (min > mas[i])
            min = mas [i];
        }
        System.out.println ("Минимальный элемент: " + min);
    }
}