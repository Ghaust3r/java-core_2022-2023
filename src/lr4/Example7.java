package lr4;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        int i,j,x,y,a,b,s; //a-хвост "змейки", b-сам массив, s-строка;
        a=0; b=0; s=0;
Scanner in=new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int width=in.nextInt();
        System.out.println("Введите количество столбцов массива");
        int length=in.nextInt();
        int[][]snake=new int[width][length];
        for (i=0;s<snake.length;s++){
            for (j=0;j<(snake[i].length-a);j++){
snake[i][j]=b;
b++;
            }
           if(i<snake.length-1){
               i++;
            }
            for(y=width-1;y>a;y--){
                snake[y][snake[i].length-1-a]=b;
                b++;
            }
            a++;
        }
        x=0;
for (i=0;i<snake.length;i++){
    for(j=0;j<snake[i].length;j++){
        System.out.print(snake[i][j]+ " ");
       x++;
    }
    System.out.println(" ");
    x=0;
}
        in.close();
            }
        }
