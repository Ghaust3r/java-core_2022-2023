package lr5;

public class Example2 {
    public static void main(String[] args) {
        Example2_1 letter = new Example2_1();
        letter.Znachenie('g', 'd');
        letter.simvoli();
    }
}
    class Example2_1 {
        private char symbol1;
        private char symbol2;

        public void Znachenie(char symbol1, char symbol2) {
            this.symbol1 = symbol1;
            this.symbol2 = symbol2;
        }

        public void simvoli() {
            int ch1 = symbol1;
            int ch2 = symbol2;
            if (ch1 > ch2) {
                ch1 = symbol2;
                ch2 = symbol1;
            }
            int polojenie = 1;
            for (int i = ch1; i <= ch2; i++) {
                System.out.println(polojenie + " " + (char) i);
                polojenie++;
            }
        }
    }


