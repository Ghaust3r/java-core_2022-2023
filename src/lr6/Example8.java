package lr6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Example8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size=in.nextInt();
        int mass[]=new int[size];
        Random random=new Random();
        System.out.println("Дан массив");
        for (int i=0;i<size;i++){
            mass[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Среднее значение = " +Avg.avg(mass));
    }
    class Avg{

        public static double avg(int m[]){
           int summ=0;
           double Avg=0;
           for (int i=0;i<m.length;i++){
              summ+=m[i];
           }
            Avg=(double) summ/m.length;
           return Avg;
        }
    }
}
