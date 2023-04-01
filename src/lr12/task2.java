package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size=a.nextInt();
        int []array1=new int[size];
        int []array2=new int[size];
        Random random=new Random();
        for (int i=0;i<size;i++){
            array1[i]=random.nextInt(500);
            array2[i]=random.nextInt(500);
        }
        System.out.println("Массив 1: ");
        System.out.println(Arrays.toString(array1));
        System.out.println("Массив 2: ");
        System.out.println(Arrays.toString(array2));
        int [] resultArr=filterArr(array1,array2);
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(resultArr));
    }
    public static int[] filterArr(int [] arr1, int [] arr2){
        return Arrays.stream(arr1).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).toArray();
    }
}
