package lr9;

public class Primer_2 {
    public static void main (String[] args) {
        try {
            System.out.println("0");

            throw new RuntimeException("Непроверяемая ошибка");
        }
        catch (RuntimeException a) {
            System.out.println("1");
            System.out.println("2 "+a);
        }
        System.out.println("3");
    }
}
