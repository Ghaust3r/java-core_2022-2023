package lr7;

public class Example5 {
    public static void main(String[] args) {

        superCLass5 superObject = new superCLass5("Hello World!");
        System.out.println(superObject.console());
        superCLass5 superObject1 = new subClass5_1("number is ",2);
        System.out.println(superObject1.console());
        subClass5_2 subObject2=new subClass5_2("letter is ", 'b');
        System.out.println(subObject2.console());

    }
}