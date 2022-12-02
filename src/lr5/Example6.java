package lr5;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Zadanie_6 test1 = new Zadanie_6(2, 5);
        test1.console();
        Zadanie_6 test2= new Zadanie_6(1);
        test2.console();
        test1.prisvoenie(3, 15);
        test1.console();
        test1.prisvoenie(-9,-1);
        test1.console();
    }

    static class Zadanie_6 {
        private static int min;
        private static int max;



        static void prisvoenie(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void console() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        Zadanie_6(int num1, int num2) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

       Zadanie_6(int num) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
        }

