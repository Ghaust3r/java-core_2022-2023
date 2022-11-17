package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[]args){
        int a,b,c,d;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число");
        int число= in.nextInt();
        a=число-1;
        System.out.println("Первое число " +a);
        b=число;
        System.out.println("Второе число " +b);
        c=число+1;
        System.out.println("Третее число " +c);
        d=a+b+c;
        System.out.println("Четвертое число " +Math.pow(d,2));
in.close();
            }
}
