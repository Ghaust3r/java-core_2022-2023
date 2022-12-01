package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        PrintWriter out=new PrintWriter (System.out);
        int monsters=in.nextInt();
        if (monsters>=1 && monsters<=4){
            System.out.println("few");
        }

        if (monsters>=5 && monsters<=9){
            System.out.println("several");
        }
        if (monsters>=10 && monsters<=19){
            System.out.println("pack");
        }
        if (monsters>=20 && monsters<=49){
            System.out.println("lots");
        }
        if (monsters>=50 && monsters<=99){
            System.out.println("horde");
        }
        if (monsters>=100 && monsters<=249){
            System.out.println("throng");
        }
        if (monsters>=250 && monsters<=499){
            System.out.println("swarm");
        }
        if (monsters>=500 && monsters<=999){
            System.out.println("zounds");
        }
        if (monsters>=1000){
            System.out.println("legion");
        }
        out.flush();
    }
}
