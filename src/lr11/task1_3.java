package lr11;

import java.util.Arrays;
import java.util.Scanner;

public class task1_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int []array=new int[size];
        int a;
        for (a=0; a < array.length; a++) {
            System.out.println("Введите число для заполнения массива");
            int numbers = in.nextInt();
            addArray(array, size, numbers, a);
        }
        System.out.println("DA");
    }
    public static int [] addArray(int []array,int size, int numbers, int position){
        if (position==size){
            return array;
        }
        array[position]=numbers;
        position++;
        printArray(addArray(array,size,numbers,position));
        return array;
    }
    public static String printArray(int []array){
        String print="";
        int a=0;
        print=Arrays.toString(array);
        a++;
        System.out.println(print);
        if (a< array.length){
            return print;
        }
        printArray(array);
        return print;
    }
}

