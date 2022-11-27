package lr3;
import java.util.Arrays;
public  class Example7 {
    public static void main(String[] args) {
        int x, size = 10;
        char chars[] = new char[size];
        char i = 's';
        for (x = 0; x < size; i--) {
            if (i % 2 == 1) {
                chars[x] = i;
                System.out.println("Элемент массива [" + x + "] равен " + chars[x]);
                x++;
            }

        }
        Arrays.sort(chars);
        System.out.println("Сортировка массива\n");
        for(x=0;x<chars.length;x++){
            System.out.println("Теперь элемент массива ["+x+"] равен " + chars[x]);
        }
    }
}