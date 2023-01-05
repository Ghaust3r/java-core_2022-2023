package lr7;

public class subClass4 extends superClass4 {
    String num2;
    subClass4 (char numEx,String numEx2){
        super(numEx);
        num2=numEx2;
    }
    subClass4(){}
    public void setNum(String  num2){
        super.setNum(num);
        this.num2=num2;
    }

    public String  getNum2(){
        return num2;
    }
    public  String getNumCopy2(Object s){
        System.out.print("Копия второго объекта ");
        return num2;
    }


}
