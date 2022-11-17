package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("день недели");
        String день =in.nextLine();
        System.out.println("месяц");
        String месяц=in.nextLine();
        System.out.println("дата");
        int дата= in.nextInt();
        System.out.printf("День недели: %s Дата: %d Месяц: %s \n",день, дата,месяц);
        in.close();
    }
}
