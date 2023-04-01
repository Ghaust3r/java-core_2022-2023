package lr12;


import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        String str="Напишите функцию, которая принимает на вход список Cтрок и возвращает новый список, Cодержащий только те строки, которые начинаются с большой буквы";
        List<String> task3=  List.of(str.split(" "));
        System.out.println("Строка после сплитования");
        for (String i:task3){
            System.out.println(i);
        }
        System.out.println("Строка после сортировки: ");
        List <String> resultStr=listFilter(task3);
        for (String e:resultStr){
            System.out.println(e);
        }
    }
    public static List<String> listFilter(List <String> list){
return list.stream().filter(x->Character.isUpperCase(x.charAt(0))).collect(Collectors.toList());
    }
}
