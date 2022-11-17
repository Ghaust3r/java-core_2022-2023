package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        System.out.println("Введите месяц");
        String Месяц=in.nextLine();
        System.out.println("Количество дней в месяце");
        int Количество_дней=in.nextInt();
        if (Количество_дней>30){

            System.out.printf ("%s содержит %d день\n",Месяц,Количество_дней);
        }
        if (Количество_дней==30){
            System.out.printf (" %s содержит %d дней\n",Месяц,Количество_дней);
        }
        if (Количество_дней<30){
            System.out.printf(" %s содержит %d дней\n",Месяц,Количество_дней);
        }
        in.close();
    }

}
