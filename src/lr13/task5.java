package lr13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) throws InterruptedException {
        String str="15 16 20 11 25";
        System.out.println(Arrays.toString(findMaxMT(new String[]{str})));
    }
    public static int[] findMaxMT(String[] lines) throws InterruptedException {
    List numbers = new ArrayList();
    int size = lines.length;
    int[] results = new int[size];
    int max = Integer.MIN_VALUE;

    List<Thread> threads = new LinkedList<>();
        for (int i = size - 1; i >= 0; i--) {
        int fi = i;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                List<Integer> num = new ArrayList<>();
                int currentMax = Integer.MIN_VALUE;

                for (String s : lines[fi].split("\\s")) {
                    num.add(Integer.parseInt(s));
                }
                for (int n : num) {
                    try {
                        Thread.sleep(1);
                        if (n > currentMax) {
                            currentMax = n;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                results[fi] = currentMax;
            }
        });
        t.start();
        threads.add(t);
    }
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        return results;
    }
}
