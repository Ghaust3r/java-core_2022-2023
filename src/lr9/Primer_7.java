package lr9;

public class Primer_7 {

public static int m() {
    try {
        System.out.println("0");
        throw new RuntimeException("Ошибка");
    } catch (RuntimeException e) {      //с помощью catch ловим исключение,=> программа запускается
        System.out.println("1 " + e);
    } finally {
        System.out.println("2");
        return 2;
    }

}

    public static void main(String[] args) {
        System.out.println(m());
    }
    }

