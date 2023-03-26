package lr11;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.print("Преобразование числа: ");
recursion(num);

    }
        public static int[] recursion(int num){
            int[] arr = new int[6];                     //количество 1 и 0 для числа в двоичной с/c
            int i = 0;
            while (num != 0) {
                arr[i] = num % 2;
                num /= 2;
                i++;
            }
            arr[i] = num;

            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            return arr;
        }

    }

