package lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[]args){
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Первое число");
        int первое_число=in.nextInt();
        System.out.println("Второе число");
        int второе_число=in.nextInt();
        a=первое_число+второе_число;
        System.out.println("Сумма двух чисел равна " +a);
        b=первое_число-второе_число;
        System.out.println("Разность двух чисел равна " +b);
        in.close();
    }
}
