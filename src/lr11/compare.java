package lr11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class compare {
    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayDeque<Integer> dequelist=new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления linkedList = " + RunningTime(linkedList));
        System.out.println("Время выполнения операции добавления dequelist = " + getRunningTime( dequelist));
    }

    private static long getRunningTime(ArrayDeque<Integer> dequelist) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 7000000; i++) {
            dequelist.add(i);
        }
        dequelist.peek();
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 7000000; i++) {
            list.add(i);
        }
        list.get(350);

        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long RunningTime(LinkedList<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 7000000; i++) {
            list.add(i);
        }
        list.get(350);
        long end = System.currentTimeMillis();
        return end - start;
    }

}
