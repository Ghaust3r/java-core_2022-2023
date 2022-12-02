package lr5;
import java.util.Scanner;
public class Example3 {

    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.println("Введите num1");
        int ch1 = id.nextInt();
        System.out.println("Введите num2");
        int ch2 = id.nextInt();
        Example3_1 myexample1 = new Example3_1();
        Example3_1 myexample2 = new Example3_1(ch1);
        Example3_1 myexample3 = new Example3_1(ch1, ch2);
    }
}
class Example3_1 {
    private int num1;
    private int num2;
    Example3_1(){
        System.out.println("Конструктор без передачи аргументов:");
    }
    Example3_1(int num1){
        this.num1 = num1;
        System.out.println("Конструктор с передачей аргумента: "+plus_one(num1));
    }
    public int plus_one (int num1) {
        this.num1 = num1;
        int result=1;
       result=result+num1;
        return result;
    }
    Example3_1(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Конструктор с передачей двух агрументов: "+plus_c1_c2(num1,num2));
    }
    public int plus_c1_c2(int n1, int n2){
        n1 = num1;
        n2 = num2;
        int result=0;
        result=n1+n2;
        return result;
    }
    }
