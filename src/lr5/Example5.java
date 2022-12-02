package lr5;

public class Example5 {
    public static void main(String[] args) {
        Zadanie5 zadanie5 = new Zadanie5(15);
        System.out.println( zadanie5.console());
        zadanie5.Set(35);
        System.out.println(zadanie5.console());
        zadanie5.Set(101);
        System.out.println( zadanie5.console());
        zadanie5.Set(-5);
        System.out.println(zadanie5.console());
        zadanie5.Set();
        System.out.println( zadanie5.console());
    }

     static class Zadanie5 {
        private int int1;

        public void Set(int n) {
            System.out.println("Метод  c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }
        public void Set() {
            System.out.println("Метод  без аргумента");
            int1 = 0;
        }

        public int console() {
            return int1;
        }
        Zadanie5(int int1) {
            System.out.println("Конструктор");
            this.Set(int1);
        }
    }
}
