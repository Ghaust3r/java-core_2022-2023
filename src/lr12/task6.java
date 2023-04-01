package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task6 {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
List<Integer> nums=new ArrayList<>();
Random random=new Random();
for (int i=0;i<10;i++){
    nums.add(random.nextInt(100));
    System.out.println(nums.get(i));
}
        System.out.println("Введите число, которое дулит данные числа");
int number=in.nextInt();
        System.out.println("Числа, делящиеся на "+number+": ");
        List<Integer> result=filterList(nums,number);
        for (Integer a:result){
            System.out.println(a);
        }
    }
    public static List<Integer>filterList(List<Integer>list,int number){
        return list.stream().filter(x->x%number==0).collect(Collectors.toList());
    }
}
