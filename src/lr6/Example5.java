package lr6;

public class Example5 {
    public static void main(String[] args) {

        System.out.println("Сумма квадратов натуральных чисел ");
        System.out.println(summ(9));
        System.out.println(F(5));
    }
    static int summ(int n) {

        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (int)(Math.pow(i, 2));
        return result;
                }
        static int F(int n) {
            if (n <= 1)
                return n;
            else
                return F(n - 1) + n * n;
    }
    }

