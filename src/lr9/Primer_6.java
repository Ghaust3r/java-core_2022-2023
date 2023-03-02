package lr9;

public class Primer_6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");

        } try {             //написал новое исключение в новом блоке try
            throw new ArithmeticException("арифметическая ошибка");
        }catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }

}
