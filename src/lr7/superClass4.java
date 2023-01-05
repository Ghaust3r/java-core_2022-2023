package lr7;

public class superClass4 {
    char num;
    superClass4 (char numEx){
        num=numEx;
    }
    superClass4(){}

    public void setNum(char num){
        this.num=num;
    }

    public  char getNum(){
        return num;
    }
    public  char getNumCopy(Object s){
        System.out.print("Копия первого объекта ");
        return num;
    }



}
