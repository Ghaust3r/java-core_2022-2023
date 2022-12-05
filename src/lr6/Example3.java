package lr6;
import java.util.Scanner;
import java.util.Random;
public class Example3 {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] mass = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
            System.out.print(mass[i] + " ");
        }
        Znachenie.m=mass.clone();
        System.out.println("Минимальное значение "+Znachenie.v());
        System.out.println("Максимальное значение "+Znachenie.viv());
        System.out.println("Среднее значение массива "+Znachenie.vivod());
    }
       static class Znachenie {

           static int[] m;


           public static int v() {
               int sum = 0;
               int Min;
               Min = m[0];
               for (int i = 0; i < m.length; i++) {
                   sum += m[i];
                   if (m[i] < Min) {
                       Min = m[i];
                   }
               }
               return Min;
           }

           public static  int viv() {
               int Max;
               Max = m[0];
               for (int i = 0; i < m.length; i++) {
                   if (m[i] > Max) {
                       Max = m[i];
                   }
               }
               return Max;
           }
           public static double vivod() {
               int sum=0;
               double Avg=0;
               for (int i = 0; i < m.length; i++) {
                   sum+=m[i];
               }
               Avg = (double) sum/ m.length;
               return Avg;
           }
       }
       }
