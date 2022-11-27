package lr3;
import java.util.Scanner;
public class Example1 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
System.out.println("Введите число от 1 до 7");
int day=in.nextInt();
switch (day){
    case 1:
        System.out.println("Это понедельник");
        break;
        case 2:
    System.out.println("Это вторник");
    break;
    case 3:
        System.out.println("Это среда");
        break;
    case 4:
        System.out.println("Это четверг");
        break;
    case 5:
        System.out.println("Это пятница");
        break;
    case 6:
        System.out.println("Это суббота");
        break;
    case 7:
        System.out.println("Это воскресенье");
        break;
    default:
        System.out.println("Введено некорректное значение");
        in.close();
}

    }
}
