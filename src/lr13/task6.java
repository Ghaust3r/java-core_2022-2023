package lr13;


import java.util.Random;
import java.util.Scanner;


public class task6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in=new Scanner(System.in);
        System.out.println("Размер массива:");
        int size=in.nextInt();
        Random random=new Random();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("сумма элементов массива при 6 потоках: "+summArray(arr,size));

    }
    public static int summArray(int arr[],int size) throws InterruptedException {
        final int[] summary = {0};

        for (int i = 1; i < 7; i++) {
            Thread t = new Thread(() -> {
                for (int a = 0; a < size; a++) {
                     summary[0] +=arr[a];
                }
            });
            t.start();
           t.join();
        }
        return summary[0];
    }
}
