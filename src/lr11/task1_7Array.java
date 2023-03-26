package lr11;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class task1_7Array {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("Введите количество человек");
        int numbers=in.nextInt();
List<Person> people=new ArrayList<>(numbers);
for (int i=0;i<numbers;i++){
    people.add(new Person(i));
}
        while (people.size() > 1){
            for (int i = 0; i<people.size(); i++){
if (i==people.size()-1){
    i=0;
}
                    if (i % 2 == 0) {
                        people.remove(i);
                        System.out.println("После удаления " + people);
                }

            }
        }
    }
}
