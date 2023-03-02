package lr9;

public class Primer_11 {
    public static void m(String str,double chislo) {
        if (str==null){
            try {
                throw new IllegalArgumentException("Строка введена неверно");
            }catch (IllegalArgumentException e){
                System.err.println("Введите строку правильно, ошибка: "+e);
            }
        }
        if (chislo>0.001){
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null,0.000001);

    }
}
