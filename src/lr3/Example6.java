package lr3;
import java.util.Random;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
            int size = in.nextInt();
            if (size > 0) {
                int[] nums = new int[size];
                int a = 0;
                int i = 0;
                while (a<size) {
                    i++;
                    if (i%5 == 2) {
                        nums[a] = i;
                        System.out.println("Элемент массива ["+a+"] = " + nums[a]);
                        a++;
                    }
                }
            }
            else {
                System.out.println("некорректное значенние");
            }
        }

        }