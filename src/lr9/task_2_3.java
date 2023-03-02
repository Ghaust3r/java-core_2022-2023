package lr9;


import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2_3 {
    public static void main(String[] args) {
        try{
            byte summ=0;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер массива");
            int str = in.nextInt();

            byte[] array = new byte[str];
            System.out.println("Введите числа для заполнения массива");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextByte();
                System.out.print("array[" + i + "] = " + array[i] + " " + "\n");

                }
            System.out.println("Массив создан");
            for (byte b : array) {
                summ = (byte) (summ + b);


            }
            System.out.println("Сумма чисел равна "+summ);
        } catch (InputMismatchException e){
            System.err.println("Неправильное значение");
        }
        }
        }



