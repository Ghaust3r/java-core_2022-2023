package lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Example9 {
    public static void main(String[] args) {
        int i,min;
       Scanner in=new Scanner(System.in);
        System.out.println("Введите размер массива");
       int size=in.nextInt();
       int nums[]=new int[size];
       Random random=new Random();
    for ( i = 0; i<nums.length; i++){
    nums[i]=random.nextInt(100);
    System.out.println("Элемент массива ["+i+"] равен " +nums[i]  );
        }
    Arrays.sort(nums);

    for ( i=0;i<nums.length;i++){
    System.out.println("После сортировки элемент массива [" + i + "] равен "+nums[i]);
   }
    min=i;
        if (nums[0] < min) {
            min = nums[0];
            i=0;
            for (i=0;nums[i]==min;i++){
                System.out.println("Минимальный массив  [" + i + "] равен " + min);
            }

            }
        }
   }



