package lr6;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Example6 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size=in.nextInt();
        System.out.println("Число для удаления элементов ");
        int ch=in.nextInt();
        int[] mass = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        Massive.mass=mass.clone();
        Massive.l=ch;

            System.out.println("Массив после ввода числа "+Arrays.toString(Massive.massive(size)));

    }
       static class Massive {
        static int []mass;
        static int l;

           public static int [] massive(int size) {
               int []array={1};
               if (l<=mass.length){
                   int count=0;
                    size=mass.length-l;
                   array=new int [size];
                    System.arraycopy(mass,l,array,0,array.length);
               }
               else {
                    size=mass.length;
                   array=mass.clone();
                   for (int i=0;i<size;i++){
                       array[i]=mass[i];
                   }
               }
               return array;
           }
        }
    }
