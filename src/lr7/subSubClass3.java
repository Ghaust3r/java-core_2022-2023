package lr7;

public class subSubClass3 extends subClass3{
    String num3;

    subSubClass3(int numEx,char numEx2,String numEx3){
        super.setNum(numEx);
        super.setNum(numEx2);
        this.num3=numEx3;
    }

    subSubClass3(){

    }

    public void setNum(int num,char num2,String num3){
        super.setNum(num);
        super.setNum(num2);
        this.num3=num3;
    }

public String getNum3(){
        return num3;
}
    @Override
    public String toString(){
        String classNameAndValue;
        classNameAndValue=  "subSub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " num 1,2,3 = " +  getNum() +", "+ getNum2()+ ", "+getNum3();
        return classNameAndValue;
    }
}
