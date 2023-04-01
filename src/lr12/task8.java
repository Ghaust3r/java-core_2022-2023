package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<10;i++){
            numbers.add(random.nextInt(100));
            System.out.println(numbers.get(i));
        }
        System.out.println("Введите число для сортировки чисел: ");
        int filt= in.nextInt();
        System.out.println("Числа после соритровки: ");
        List<Integer>result=filterList(numbers,filt);
        for (Integer a:result){
            System.out.println(a);
        }
    }
    public static List<Integer> filterList(List<Integer>list,int filt){
        return list.stream().filter(x->x>filt).collect(Collectors.toList());
    }

}
