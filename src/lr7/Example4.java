package lr7;

public class Example4 {
    public static void main(String[] args)  {

        superClass4 superObject=new superClass4('a');
        System.out.println(superObject.getNum());
        System.out.println(superObject.getNumCopy(superObject));
        subClass4 subObject=new subClass4('b', "letter");
        System.out.println(subObject.getNum2());
        System.out.println(subObject.getNumCopy2(subObject));
        subSubClass4 subSubObject= new subSubClass4('c',"letter",4);
        System.out.println(subSubObject.getNum3());
        System.out.println(subSubObject.getNumCopy3(subSubObject));
    }
}
