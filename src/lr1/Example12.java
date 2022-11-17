package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[]args){
        int этот_год,год_рождения;
        этот_год=2022;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int Возраст=in.nextInt();
        год_рождения=этот_год-Возраст;
        System.out.println("Год рождения " +год_рождения);



    }
}
