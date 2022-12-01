package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int H=in.nextInt();
        int L=in.nextInt();
        int cans=H+L-1;
        int H1=cans-H;
        int L1=cans-L;
        out.println(H1+ " " +L1);
        out.flush();
    }
}
