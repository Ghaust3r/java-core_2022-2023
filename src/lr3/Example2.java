package lr3;
import java.util.Scanner;
public class Example2 {
    public static void main(String[]args) {
        System.out.println("1. if ");
        System.out.println("2. switch ");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите метод:");
        int choice = in.nextInt();
        if (choice == 1) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите день недели(кириллицей с нижним регистром)");
            String day = id.nextLine();
            if (day.equals("понедельник")) {
                System.out.println("Первый день недели");
            } else if (day.equals("вторник")) {
                System.out.println("Второй день недели");
            } else if (day.equals("среда")) {
                System.out.println("Третий день недели");
            } else if (day.equals("четверг")) {
                System.out.println("Четвертый день недели");
            } else if (day.equals("пятница")) {
                System.out.println("Пятый день недели");
            } else if (day.equals("суббота")) {
                System.out.println("Шестой день недели");
            } else if (day.equals("воскресенье")) {
                System.out.println("Седьмой день недели");

            } else {
                System.out.println("Такого дня не существует");
            }
            id.close();
        }
            else if (choice == 2) {
                Scanner of = new Scanner(System.in);
                System.out.println("Введите день недели(кириллицей с нижним регистром)");
                String day = of.nextLine();
                switch (day) {
                    case "понедельник":
                        System.out.println("Первый день недели");
                        break;
                    case "вторник":
                        System.out.println("Второй день недели");
                        break;
                    case "среда":
                        System.out.println("Третий день недели");
                        break;
                    case "четверг":
                        System.out.println("Четвертый день недели");
                        break;
                    case "пятница":
                        System.out.println("Пятый день недели");
                        break;
                    case "суббота":
                        System.out.println("Шестой день недели");
                        break;
                    case "воскресенье":
                        System.out.println("Седьмой день недели");
                        break;
                    default:
                        System.out.println("Такого дня не существует");

                }
                of.close();

        }
    }

    }



