package lr3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите первое число");
        int first = in.nextInt();
        System.out.println("Ввведите второе число");
        int second = in.nextInt();
        System.out.println("1. while ");
        System.out.println("2. for");
        System.out.println("Выберите метод:");
        int choice = in.nextInt();
        if (choice == 1) {
            if(first>second){
                while (first>second) {
                    System.out.printf("%d,%d ",second,first);
                    second++;
                }
                }
            else {
                while (first<second){
                    System.out.printf("%d,%d ",first,second);
                    first++;
                }
            }
            }
        if (choice==2){
            if(first>second){
                for(first=first;first>second;second++){
                    System.out.printf("%d, %d ",second,first);
                }
            }
            else {
                for (second=second;first<second;first++){
                    System.out.printf("%d, %d ",first,second);
                }
            }
        }
        }

                    }

