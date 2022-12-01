package lr4;
import java.util.Scanner;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        int i,j;
        Scanner in=new Scanner(System.in);
        System.out.print("Введите количество строк ");
        int width=in.nextInt();
        System.out.print("Введите количество столбцов ");
        int length=in.nextInt();
        int[][] one =new int[width][length];
        for(i=0;i<width;i++){
            for (j=0;j<length;j++){
                Random random=new Random ();
                one[i][j]=random.nextInt(100);
                System.out.println(i+ " " +j+ " " +one[i][j]);
            }

        }
        System.out.println("Происходит перестановка");
        int [][] two=new int[length][width];
for (i=0;i<length;i++){
    for (j=0;j<width;j++){
        two[i][j]=one[j][i];
        System.out.println(i+" "+j+ " "+two[i][j]);

    }
}
in.close();
    }
}
