package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) {

try {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите количество строк массива");

    int str = in.nextInt();
    System.out.println("Введите количество столбцов массива");
    int stlb = in.nextInt();

    int[][] array = new int[str][stlb];
    for (int i = 1; i <= str; i++) {
        System.out.print(" " + i + "  ");
    }
    System.out.println();
    for (int i = 0; i < str; i++) {
        System.out.print("( ");
        for (int j = 0; j < stlb; j++) {
            array[i][j] = '+';
            System.out.print(" + ");
        }
        System.out.println(" )");
    }
    System.out.println("Выберите номер столбца, который желаете вывести на экран");
    int nomer = in.nextInt();
        if (nomer <= stlb) {
                for (int i = 0; i <= str; i++) {
                    System.out.print(" ");
                    if (i == nomer) {
                        System.out.print("  " + i + " ");
                    }
                }
                System.out.println();
                System.out.print(" ");
                for (int i = 0; i < str; i++) {
                    System.out.print(" ");

                    for (int j = 0; j < stlb; j++) {
                        System.out.print(" ");
                        if (j == nomer - 1) {
                            System.out.print(" ");
                            System.out.println(" +");
                        }
                    }
                }
            }
        if (nomer != stlb) {
            if (nomer<=0) {
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует");
            }
            if (nomer>stlb){
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует");
            }
        }
}catch (InputMismatchException e){
            System.err.println("Введена строка");
        }catch (ArrayIndexOutOfBoundsException e){
    System.err.println(e);
}
        }
    }







