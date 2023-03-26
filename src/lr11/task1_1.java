package lr11;

public class task1_1 {
    private static int step=1;
    public static void main(String[] args) {


        System.out.print(fact(5));

    }

    public static int fact(int n) {
        int result;

        if (n == 0) {
            for (int i=0;i<step;i++){
                System.out.print(n+" -> ");
            }

            return 0;
        }

        if (n == 1) {
            for (int i=0;i<step;i++){
            System.out.print(n + " -> ");
        }
            return 1;
        } else {



            result = fact(n - 2) + fact(n - 1);
            System.out.print(n+ " -> ");


            return result;

        }
    }
}