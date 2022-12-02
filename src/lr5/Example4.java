package lr5;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
Miha test1=new Miha('A',12);
Miha test2=new Miha(65.1267);
    }
    static class Miha{
        private char ch1;
        private int int1;
        Miha(char c,int i){
this.ch1=c;
this.int1=i;
int in=(int)(Math.log10(int1)+1);
double result=(double)ch1+(double)int1*1/Math.pow(10,in);
            System.out.println(result+" "+(double)ch1+" "+in);
        }
        Miha(double a){
            char ch1=(char)a;
            int1=(int)((a-(int)a)*100);
            System.out.println(ch1+" "+int1);
        }

    }
}
