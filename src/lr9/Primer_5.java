package lr9;

public class Primer_5 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1 ");
        }catch (RuntimeException e){        //Меняем местами Exception с RuntimeException
                System.out.println("2 ");
            }
        catch (Exception e){
            System.out.println("3 ");
        }
        System.out.println("4");
    }
}
