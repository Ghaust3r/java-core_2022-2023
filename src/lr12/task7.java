package lr12;

import org.w3c.dom.css.Counter;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String stroka="привет строка слово пять один два три";
        List<String> task7= List.of(stroka.split(" "));
        System.out.println("Строка после сплитования ");
        for (String t:task7){
            System.out.println(t);
        }
        System.out.println("Введите длину слов, которых хотите вывести");
        int size=in.nextInt();
        System.out.println("Слова после соритровки: ");
        List<String>result=filterList(task7,size);
        for (String a:result){
            System.out.println(a);
        }
    }
    public static List<String> filterList(List<String>list,int size){
        return list.stream().filter(x-> x.length()==size).collect(Collectors.toList());
    }
}
