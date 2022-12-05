package lr6;
public class Example4 {
    public static void main(String[] args) {
        System.out.println("Двойной факториал числа ");
        System.out.println(F(5));
        }
        static int Example4_1(int n) {
            int result = 1;
            for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2)
                result *= i;
            return result;
        }
        static int F(int n) {
            if (n <= 1)
                return 1;
            else
                return n * F(n - 2);
        }
}