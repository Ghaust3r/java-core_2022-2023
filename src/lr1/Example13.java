package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[]args){
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Первое число");
        int первое_число = in.nextInt();
        a=первое_число;
        System.out.println("Второе число");
        int второе_число= in.nextInt();
        b=второе_число;
        in.close();
        c=a+b;
        System.out.println("Сумма чисел = " +c);


    }
}
