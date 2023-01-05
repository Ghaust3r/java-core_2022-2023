package lr7;

public class Example2 {
    public static void main(String[] args) {
        superClass2 superObject=new superClass2("letter");
        System.out.println(superObject.getStr());
        subClass2 subObject=new subClass2("letter",4);
        subObject.setStr("aboba");
        subObject.getStr();
    }
}
