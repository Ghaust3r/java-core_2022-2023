package lr7;

public class subSubClass4 extends subClass4 {
    int num3;

    subSubClass4(char numEx,String  numEx2,int numEx3){
        super.setNum(numEx);
        super.setNum(numEx2);
        this.num3=numEx3;
    }


    public void setNum(char num,String num2,int num3){
        super.setNum(num);
        super.setNum(num2);
        this.num3=num3;
    }

    public int getNum3(){
        return num3;
    }
    public  int getNumCopy3(Object s){
        System.out.print("Копия третьего объекта ");
        return num3;
    }
}
