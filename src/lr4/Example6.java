package lr4;
import java.util.Scanner;
import java.util.Random;
public class Example6 {
    public static void main(String[] args) {
        int i,j,x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int length=in.nextInt();
        System.out.println("Введите количество столбцов массива");
        int width=in.nextInt();
        int[][] nums=new int[length][width];
        Random random=new Random();
        for (i=0;i<length;i++){
            for (j=0;j<width;j++){
                nums[i][j]=random.nextInt(100);
                System.out.println(i+ " "+nums[i][j] );
            }
        }
       int without_x=random.nextInt(length-1);
              int  without_y=random.nextInt(width-1);

        System.out.println("Удаляется " +without_x+ " и " +without_y);
        int  two[][]=new int [length-1][width-1];
        System.out.println("После удаления получается массив:");
        for(i=0,x=0;i<length-1;x++){
            for (j=0,y=0;j<width-1;y++){
                two[i][j]=nums[x][y];
                System.out.println(i+ " " +two[i][j]);
                j++;
            }
            i++;
        }
        in.close();

    }
}

