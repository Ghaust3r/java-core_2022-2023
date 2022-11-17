package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        int этот_год, возраст;
        этот_год = 2022;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String имя= in.nextLine();
        System.out.println("Введите год рождения");
        int год_рождения = in.nextInt();
        возраст = этот_год - год_рождения;
        System.out.printf("Имя %s Возраст %d \n",имя,возраст);
    }
}
