package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class task4 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<10;i++){
            nums.add(random.nextInt(15));
            System.out.println(nums.get(i));
        }
        List<Integer>quadr=square(nums);
        System.out.println("Квадраты чисел: ");
        for (Integer a:quadr){
            System.out.println(a);
        }
    }
    public static List<Integer>square(List<Integer>list){
        return list.stream().map(x->x*x).collect(Collectors.toList());
    }
}
