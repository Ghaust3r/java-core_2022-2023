package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size=a.nextInt();
        int []array=new int[size];
        Random random=new Random();
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(500);
        }
        System.out.println("Массив создан");
        System.out.println(Arrays.toString(array));
        int []result=filterArr(array);
        System.out.println("Массив после сортировки");
        System.out.println(Arrays.toString(result));
    }
    public static int []filterArr(int [] arr){
return Arrays.stream(arr).filter(x -> x%2==0).toArray();
    }
}
