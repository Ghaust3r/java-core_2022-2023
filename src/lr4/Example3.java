package lr4;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        int i,j,s;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width=in.nextInt();
        System.out.println("Введите длину прямоугольника");
        int length=in.nextInt();
        if(width!=length) {
            int[][] nums = new int[width][length];
            for (i = 0; i < width; i++) {
                for (j = 0; j < length; j++) {
                    nums[i][j] = 2;
                }
            }
            for (i = 0; i < width; i++) {
                System.out.println("");
                 for(j=0;j<length;j++){
                  System.out.print(+ nums[i][j]);
}
            }
        }
            else{
            System.out.println("это квадрат");
        }
            in.close();
        }
    }
