package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 0;
        b = 1;
        c=a+b;
        System.out.println("1. while ");
        System.out.println("2. for");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите метод:");
        int choice = in.nextInt();
        if (choice == 1) {
            Scanner ab = new Scanner(System.in);
            System.out.println("Введите количество чисел");
            int chisla = ab.nextInt();
            while (chisla>0) {
                System.out.printf("%d, ", a);
                c=a+b;
                a = b;
                b = c;
                chisla--;

            }
            System.out.println("...");
        }

            if (choice == 2) {
                Scanner ac = new Scanner(System.in);
                System.out.println("Введите количество чисел");
                int chisla = ac.nextInt();
                for(chisla=chisla;chisla>0;chisla--){
                    System.out.printf("%d ", a);
                    c=a+b;
                    a = b;
                    b = c;
                }
                System.out.println("...");
                }

            }




        }


