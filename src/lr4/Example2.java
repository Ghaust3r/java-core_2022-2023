package lr4;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        int i,j,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер треугольника");
        int size=in.nextInt();
        z=0;
        for(i=0;i<size;i++){
            System.out.println("");
            for(j=0;j<=z;j++){
                System.out.print("+");
                }
            z=z+1;
            }
        System.out.println(" - прямоугольный треугольник");
        in.close();
                }
            }

