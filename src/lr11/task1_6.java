package lr11;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class task1_6 {
    public static void main(String[] args) {
        String pr = "asdfg";

        HashforTask1_6 node1 = new HashforTask1_6(0, "adaf");
        HashforTask1_6 node2 = new HashforTask1_6(1, "a'fkq;lf");
        HashforTask1_6 node3 = new HashforTask1_6(2, "awse");
        HashforTask1_6 node4 = new HashforTask1_6(3, "wad");
        HashforTask1_6 node5 = new HashforTask1_6(4, "wqddwa");
        HashforTask1_6 node6 = new HashforTask1_6(5, "wdaad");
        HashforTask1_6 node7 = new HashforTask1_6(6, "wqrtha");
        HashforTask1_6 node8 = new HashforTask1_6(7, "wda");
        HashforTask1_6 node9 = new HashforTask1_6(8, "wsd");
        HashforTask1_6 node10 = new HashforTask1_6(9, "dgt");
        Map<Integer, String> map = new HashMap<>();
        map.put(node1.id, node1.String);
        map.put(node2.id, node2.String);
        map.put(node3.id, node3.String);
        map.put(node4.id, node4.String);
        map.put(node5.id, node5.String);
        map.put(node6.id, node6.String);
        map.put(node7.id, node7.String);
        map.put(node8.id, node8.String);
        map.put(node9.id, node9.String);
        map.put(node10.id, node10.String);
        System.out.print("Если ключ больше 5: ");
        for (int key : map.keySet()) {
            if (key > 5) {

                System.out.print(map.get(key) + "  ");
            }
        }
        System.out.println();
        System.out.print("Если ключ равен 0: ");
        for (int key : map.keySet()) {
            if (key == 0) {

                System.out.print(map.get(key) + ", ...  ");
            }
        }
        System.out.println();
        System.out.println("Умножение ключей для строк больше 5");

        System.out.println(multi(map));
    }


        private static int multi(Map<Integer, String> map) {
            return map.entrySet().stream().filter(e -> e.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x, y) -> x * y);
        }


    }


