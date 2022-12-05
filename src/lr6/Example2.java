package lr6;

public class Example2 {
    public static void main(String[] args) {
        StaticMethod test1=new StaticMethod();
        test1.numberIncriment();
    }
}
class StaticMethod {
    private static int number=0;

    public static int numberIncriment() {
        System.out.println("Первоначальное значение числа " +number);
        number=number+1;
        System.out.println("После увеличения "+number);
        return number;
    }
}


