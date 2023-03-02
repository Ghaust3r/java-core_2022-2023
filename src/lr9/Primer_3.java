package lr9;

public class Primer_3 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }catch (NullPointerException a){
            System.out.println("1 "+a);
        }catch (RuntimeException a){
            System.out.println("2 " +a);
        }
        catch (Exception a){
            System.out.println("3 "+a);
        }
        System.out.println("4");
    }
}
