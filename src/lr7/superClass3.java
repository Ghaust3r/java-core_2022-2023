package lr7;

public class superClass3 {
int num;
    superClass3 (int numEx){
       this.num=numEx;
    }
  superClass3(){}
public void setNum(int num){
    this.num=num;
}

public  int getNum(){
    return num;
}
 @Override
    public String toString(){
        String classNameAndValue;
        classNameAndValue=  "super" + "\n" +
             " Class name: " + this.getClass().getSimpleName() + "\n" +
             " num 1 = " + this.getNum();
        return classNameAndValue;
 }
}
