package lr7;

public class Example3 {
    public static void main(String[] args) {

    superClass3 superObject=new superClass3(2);
    String className=superObject.toString();
        System.out.println(className);
    subClass3 subObject=new subClass3(3,'a');
    String className1=subObject.toString();
        System.out.println(className1);
    subSubClass3 subSubObject= new subSubClass3(4,'b',"letter");
    String className2=subSubObject.toString();
        System.out.println(className2);
    }
}
