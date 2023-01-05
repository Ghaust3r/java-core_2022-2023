package lr7;

public class subClass3 extends superClass3 {

    char num2;

    subClass3 (int numEx,char numEx2){
super(numEx);
this.num2=numEx2;
    }
    subClass3(){}

    public void setNum(int num,char num2){
        super.setNum(num);
        this.num2=num2;
    }

    public char getNum2(){
        return num2;
    }

    @Override
    public String toString(){
        String classNameAndValue;
        classNameAndValue=  "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num 1,2 = " + getNum() +", "+ getNum2();
        return classNameAndValue;
    }
}
