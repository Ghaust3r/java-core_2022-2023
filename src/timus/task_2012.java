package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
int number=in.nextInt();
int pervijChas=12-number;
int raznica=pervijChas*45;
if (raznica<=240){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        out.flush();
    }
}
