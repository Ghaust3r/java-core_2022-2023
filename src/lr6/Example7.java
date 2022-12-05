package lr6;

import java.util.Scanner;
import java.util.Arrays;
public class Example7 {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Введите размер массива");
            int size=in.nextInt();
            char ch[]=new char[size];
            System.out.println("Введите символы");
            String word=in.next();
            String A="";
            System.out.println(word);
            ch=word.toCharArray();
            System.out.println(Arrays.toString(ch));
            ch=Massive.trueMassive(ch,size);
            System.out.println("Массив после " +Arrays.toString(ch));
            System.out.println("Значения буквенного массива "+Arrays.toString(Massive.intMassive(ch,size)));

        }
    static class Massive {

        static  char[]  trueMassive(char []arr,int size){

            char []a=new char [size];
            System.arraycopy(arr,0,a,0,size);

            return a;
        }
        static int[] intMassive(char[]a,int size){
            int []in=new int[size];
            for (int i=0;i<a.length;i++){
                in[i]=(int) a[i];
            }
            return in;
        }
    }
    }

