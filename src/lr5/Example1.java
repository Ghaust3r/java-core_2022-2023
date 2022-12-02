package lr5;
public class Example1 {
    public static void main(String[] args) {
       Example1_1 Letter1 = new Example1_1();
        Letter1.console();
        Letter1.Set('F');
        System.out.println(Letter1.symbolReturn());
        Letter1.console();
    }
}
    class Example1_1 {
        private char symbol;

        public void Set(char symbol1) {
            this.symbol = symbol1;
        }

        public int symbolReturn() {
            return (int) symbol;
        }

        public void console() {
            System.out.println("symbol1 = " + symbol);
            System.out.println("symbol1 = " + symbolReturn());
        }
    }



