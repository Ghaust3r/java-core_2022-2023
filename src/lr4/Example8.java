package lr4;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово ");
        String word = in.nextLine();
        System.out.println("Введите ключ шифрования");
        int key = in.nextInt();
        char[] encryptword = word.toCharArray();
        for (i = 0; i <encryptword.length;i++){
            encryptword[i]=(char) (encryptword[i]+key);
        }

        System.out.println(encryptword);
        System.out.println("Выполнить обратное преобразоание? (y/n)");
        String answer = in.next();
        boolean YorN = false;
        while (YorN=true) {
            String reply = in.next();
            if (reply.equals("y")) {
                char[] decryptword = encryptword;
                for (i = 0; i <encryptword.length;i++){
                    encryptword[i]=(char) (encryptword[i]-key);
                }
                System.out.println("Слово после дешифровки");
                System.out.println(decryptword);
                YorN = true;
            }
            else if (reply.equals("n")) {
                System.out.println("До свидания!");
                YorN = true;
            }
            else {
                System.out.println("Введите корректный ответ");
                YorN = false;
            }
        }
    }
}

