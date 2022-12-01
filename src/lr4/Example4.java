package lr4;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        int i,j,z,s;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер треугольника");
        int size=in.nextInt();
        int[][] nums=new int[size][size];
        z=0;
        for (i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                nums[i][j]=2;
            }
        }
        for (i=0;i<nums.length;i++){
            System.out.println("");
            for (j=0;j<=z;j++){
                s=i+1;
                System.out.print(+nums[i][j]);
            }
            z=z+1;
        }
in.close();
    }
}
