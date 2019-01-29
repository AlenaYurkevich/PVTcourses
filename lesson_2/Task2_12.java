package core;
import java.util.Scanner;

public class Task2_12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите размер массива: ");
        int number = scanner.nextInt();
        
        int mas [] = new int[number];
        int k = 2;
        int [] mas1 = new int [number+k];
        
        // заполняем первый массив рандомными числами от 0 до 30
        for (int i = 0; i < mas.length; i++){
            mas [i] = (int)(Math.random()*30);
            System.out.print(mas[i] + " ");
        }
                
        System.out.println();
        System.out.println("Новый массив");
        // сдвигаем все элементы вправо на два, первым и вторым элементом становятся нули
        for (int i = 0; i < mas.length; i++){
            mas1 [i+k] = mas[i];
            mas[i] = mas1[i];
        }
        
        // выводим новый массив в одну строку
        for (int i = 0; i < mas1.length; i++){
            System.out.print(mas1[i] + " ");
        }
    }
}
