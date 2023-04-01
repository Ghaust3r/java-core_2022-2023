package lr12;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {
        String stroka="строк";
        String str="строк слово функция стрелочка строк";
        List<String>  task5= List.of(str.split(" "));
        System.out.println("Строка после сплитования: ");
        for (String a:task5){
            System.out.println(a);
        }
        System.out.println("Строки, содержащие слово "+stroka+": ");
        List<String>resultStr=listFilter(task5,stroka);
        for (String b:resultStr){
            System.out.println(b);
        }

    }
    public static List<String>listFilter(List<String>list,String stroka){
        return list.stream().filter(x-> x.equals( stroka)).collect(Collectors.toList());
    }
}
