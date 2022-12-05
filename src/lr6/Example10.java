package lr6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMaxmassive(1, 2, 3, 6, 9, 1, 3, 456, 367)));
    }

    static int[] minMaxmassive(int... a) {
        int in[] = {0, 2147483647};
        for (int i = 0; i < a.length; i++) {
            if (in[0] < a[i]) {
                in[0] = a[i];
            }
            if (in[1] > a[i]) {
                in[1] = a[i];
            }
        }
        return in;
    }
}
