package lr7;

public class subClass2 extends superClass2{
     int num;

    subClass2(String strEx,int num){
       super(strEx);
       this.num=num;
    }
    @Override
    public void setStr(String str) {
        super.setStr(str);
    }

    public void setStr(int num) {
        this.num=num;
    }

    public void setStr(String str,int num){
        super.setStr(str);
        this.num=num;
    }
@Override
    public int getStr() {
        int word=super.getStr();
    System.out.println(word);
    return 0;
    }

}
