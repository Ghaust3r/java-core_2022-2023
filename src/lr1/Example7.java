package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main (String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("Name: ");
        String name= in.nextLine();
        System.out.println("Age" );
        int age= in.nextInt();
        System.out.printf("Name: %s, Age: %d\n",name,age);
    }
}
