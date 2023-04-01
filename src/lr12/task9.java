package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        String str="1слово слово пять шесть 1 5 @буква";
        List<String> task9=List.of(str.split(" "));
        System.out.println("Строка после сплитования: ");
        for (String a:task9){
            System.out.println(a);
        }
        System.out.println("Слова после сортировки: ");
        List<String> result=listFilter(task9);
        for (String b:result){
            System.out.println(b);
        }
    }
    public static List<String> listFilter(List<String>list){
        return list.stream().filter(x-> Character.isLetter(x.charAt(0))).collect(Collectors.toList());
    }

}
