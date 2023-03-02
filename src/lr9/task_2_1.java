package lr9;
import java.util.InputMismatchException;
import java.util.Scanner;


public class task_2_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер массива");
            int str = in.nextInt();
            double ch = 0;
            if (str != ch) {
                int[] array = new int[str];
                System.out.println("Введите числа для заполнения массива");
                for (int i = 0; i < array.length; i++) {
                    array[i] = in.nextInt();
                    System.out.print("array[" + i + "] = " + array[i] + " " + "\n");
                }
                System.out.println("Массив создан");
                double avg = 0;
                int w = 0;
                double sum = 0;


                for (int j : array) {
                    if (j >= 0) {
                        sum = sum + j;
                        w++;
                    }
                    }
                if (w==0) {
                    throw new ArrayIndexOutOfBoundsException("Положительные элементы отсутствуют");
                    }
                    avg = sum / w;
                    System.out.println("Среднее значение массива равно " + avg);
            }
            } catch (InputMismatchException e) {
                System.err.println("Введено неправильное значение. Пожалуйста,введите целое число");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            }


            }


        }







