package lr6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size=in.nextInt();
        int arr[]=new int[size];
        Random random=new Random();
        System.out.println("Массив до перестановки");
        for (int i=0;i<size;i++){
            arr[i]=random.nextInt(8);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Массив после перестановки");
        System.out.println(Arrays.toString(reverse(arr)));
}
   static int[] reverse( int[] mas) {

        int buffer = 0;
        for (int i = 0, y = mas.length-1; i < mas.length/2; i++, y--)
        {
            buffer = mas[y];
            mas[y] = mas[i];
            mas[i] = buffer;
        }
        return mas;
    }

    }