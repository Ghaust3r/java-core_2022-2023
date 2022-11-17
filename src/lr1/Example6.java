package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println ("Your name: ");
        String name= in.nextLine();
        System.out.println ("Your surname");
        String surname= in.nextLine();
        System.out.println("Your patronymic");
        String patronymic= in.nextLine();
        System.out.printf ("Hello %s %s %s \n", name, surname, patronymic );
in.close();
    }
}
