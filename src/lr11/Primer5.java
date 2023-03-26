package lr11;

public class Primer5 {
    public static void main(String[] args) {

        System.out.println(fact(4));}
    public static int fact(int n){
        int result;
        if (n==0){
            System.out.println(n);
            return 0;
        }
        if (n==1){
            System.out.println(n);
            return 1;
        }
        else {

            result=fact(n-2)+fact(n-1);

           return result;

        }
    }
}
