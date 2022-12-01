package lr4;
import java.util.Scanner;
public class Example9 {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private static char symbol_sdvig(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1) {
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }
    }



    public static void main (String[]args){
        int i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текс для шифрования на русском с нижним регистром");
        String word = in.nextLine();
        word = word.toLowerCase();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        System.out.println("Текст после преобразования ");
        j = word.length();
        for (i = 0; i < j; i++) {

            System.out.println(symbol_sdvig(word.charAt(i), key));
        }
        System.out.println("Выполнить обратное преобразоание? (y/n)");
        String answer = in.next();
        boolean YorN = false;
        while (YorN = true) {
            String reply = in.next();
            if (reply.equals("y")) {
                System.out.println("Слово после дешифровки");
                for (i = 0; i < j; i++) {
                    System.out.println((word.charAt(i)));
                }
                YorN = true;
            } else if (reply.equals("n")) {
                System.out.println("До свидания!");
                YorN = true;
            } else {
                System.out.println("Введите корректный ответ");
                YorN = false;
            }
        }

    }

}