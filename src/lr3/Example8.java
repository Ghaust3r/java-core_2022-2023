package lr3;
import java.util.Arrays;
public class Example8 {
    public static void main(String[] args) {
        int y, i, j, size = 10;
        char[] charsArray = new char[size];
        char[] vowelArray = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        char x = 'A';
        i = 0;
        j = 0;
        for (i = 0; i < size; i++) {
            boolean statement = true;
            for (j = 0; j < vowelArray.length; j++) {
                if (x == vowelArray[j]) {
                    i--;
                    statement = false;
                    break;
                }
            }
            if (statement) {
                charsArray[i] = x;
            }
            x++;
        }
            for (y = 0; y < size; y++) {
                System.out.print(charsArray[y]+ "\t");
            }
        }
    }



