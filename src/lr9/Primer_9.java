package lr9;

public class Primer_9 {
    public static int m(){
        try{
            System.out.println("0");
            return 15;    //return выводит только одно значение
        }finally{
            System.out.println("1");
//            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
