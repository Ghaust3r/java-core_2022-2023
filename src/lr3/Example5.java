package lr3;
import java.util.Scanner;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int chisla=in.nextInt();
        System.out.println("1. while ");
        System.out.println("2. for");
        System.out.println("Выберите метод:");
        int choice = in.nextInt();
        if (choice == 1) {
 int sum=0;
Random random=new Random();
while (chisla>0){
int numbers=random.nextInt(100);
if (numbers % 5==2 || numbers % 3 ==1){
    System.out.printf("%d ", numbers);

    sum=sum+numbers;
    chisla--;

}
}
            System.out.printf("Сумма чисел равна %d ", sum);
    }
        if (choice==2){
            int sum=0;
          for (int a=0;chisla>0;a++){
              Random random=new Random();
              int b=random.nextInt(100);
if( b% 5==2|| b % 3==1){
    System.out.printf("%d ", b);
    sum=sum+b;
    chisla--;
}
          }
            System.out.printf("Сумма чисел равна %d ",sum);
        }
    }
}
