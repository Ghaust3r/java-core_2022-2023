package lr9;

public class Primer_4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException a){  //Меняем NullPointerException на RuntimeException, чтобы ошибка перехватилась
            System.out.println("1 "+a);  //и код запустился
        }
        catch (RuntimeException a){
            System.out.println("1 "+a);
        }
        System.out.println("2");
    }
}
