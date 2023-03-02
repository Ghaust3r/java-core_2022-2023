package lr9;

public class Primer_1 {
public static void main (String [] args){
    try {
        System.out.println("0");
        throw new RuntimeException ("Непроверяемая ошибка");
    } catch (RuntimeException a){
        System.out.println("1 "+a);
    }
    System.out.println("2");
}
}
